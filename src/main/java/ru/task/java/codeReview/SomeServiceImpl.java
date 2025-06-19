package ru.task.java.codeReview;

import java.util.List;

// Микросервис чеков высоконагруженного маркетплейса, десятки тысяч заказов в сутки.
// Основная функция микросервиса - отправка чеков в налоговую (во внешний независимый сервис)
// Инфраструктура - Kubernetes 8 подов (реплик), высоконагруженный.
// TaxClient - клиент налоговой (feign) - timeout = 60 секунд (не наш, не можем повлиять)
@Service
@AllArgsConstructor
public class SomeServiceImpl implements SomeService {
    private final TaxClient taxClient;
    private final ReceiptDao receiptDao;
    private final SomeService self; // -> 1

    @Override  // -> 6
    @Transactional // -> 3
    @Scheduled(cron = "${cron.expression}")  // "30 30 * * *"
    @Shedlock(...) // -> 2
    public void processJobRunning() {
        List<Receipt> receipts = self.getRefundReceipts();

        for (Receipt receipt : receipts){
            receipt.setProcessed(true);
            receiptDao.save(receipt);
            var receiptDto = new ReceiptDto(receipt.getId(), receipt.getSum());
            taxClient.idempotentSendReceipt(receiptDto); // -> 4
        }
    }

    @Transactional(readOnly = true) // -> 5
    public List<Receipt> getRefundReceipts() {
        return receiptDao.findAllBySourceAndProcessedFalse(ReceiptSource.REFUND); // select * from receipt where source = 'REFUND' and processed = false;
    }
}

// граница класса ----
public interface ReceiptDao extends JpaRepository<Receipt, Long> {
    List<Receipt> findAllBySourceAndProcessedFalse(ReceiptSource source);
}

//ниже этой строки - все корректно - enum, dto, entity - только для наглядности
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean processed;
    private String sum;
    private ReceiptSource source;
}

@Data
@NoArgsConstructor
public class ReceiptDto {
    private Long id;
    private String sum;
    private ReceiptSource source;
}

public enum ReceiptSource {
    DISCOUNT,
    SELL,
    REFUND
}

// 8 реплик
// 60 секунд долгий ответ
// @AllArgsConstructor спринг попытается заинжектить бины в конструктор
// 1. private final SomeService self; будет селфинжект, через конструктор делать нельзя (падение)
//  фикс - убираем @AllArgsConstructor на self @autowired делаем конструктор с оставшимеся полями
//  либо вынести self dvtcnt c public List<Receipt> getRefundReceipts() в другой класс
// 2. По времени успеваем разгребать только 1 ноду, ставим @Shedlock(...) либо пишем разгребатель ниже
// 3. Если 1 чек упадет по таймауту вся транзакция откатится
// 4. Ждем последовательно в коде обработку чеков
// фикс - использование легковесных потоков из java 21 либо проджект реактор либо пул потоков (в большенстве случаев)!!!!
// 5. @Transactional не нужен, повторения кода в public interface ReceiptDao extends JpaRepository<Receipt, Long>
// 6. Transactional Outbox (Транзакционная "окошко") - это шаблон проектирования в распределенных системах,
// предназначенный для обеспечения надежной отправки сообщений. В рамках этого паттерна сообщения сначала
// сохраняются во внутреннем хранилище (обычно таблица в базе данных) в рамках той же транзакции,
// что и основная бизнес-операция. Затем, после успешного завершения транзакции, эти сообщения извлекаются
// из хранилища и отправляются в брокер сообщений или другой конечный пункт назначения.


