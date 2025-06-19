package ru.task.java.codeReview.interview2;

public class Task6 {

    @Service
    public class InvoiceService {

        @Transactional
        public void createPdf() {
            // ...
        }


        public void create() {
            createPdf();  // -> 1
        }
    }

    @Service
    public class UserService {

        @Autowired       //  -> 2
        InvoiceService invoice;

        public void createTest() {
            invoice.create();
        }
    }

    //  1. Вызов в обход транзакции
    //  2. Инициализировать Бин лучше через конструктор
    //  3. Названия create() и createPdf() недостаточно описательные
    //  4. Отсутствие обработки исключений


