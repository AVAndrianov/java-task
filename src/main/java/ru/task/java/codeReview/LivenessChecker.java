package ru.task.java.codeReview;

import java.security.cert.Extension;
import java.util.Map;
import java.util.TreeMap;

/**
 * Extension.java
 */
public enum Extension
{
    JPG,
    GIF,
    WAV,
    MPEG
}


/**
 * LivenessChecker.java
 */
@Service
public class LivenessChecker
{
    public Map<Extension, String> CONTENT_TYPE_MAP = new TreeMap<>()
    {{
        put(Extension.JPG, "image");
        put(Extension.GIF, "image");
        put(Extension.WAV, "audio");
        put(Extension.MPEG, "video");
    }};

    @Autowired
    public LivenessSystemSelector selector;

    public void checkLiveness(byte[] data, Extension extension, String type)
    {
        String contentType = CONTENT_TYPE_MAP.get(extension);
        List<LivenessSystem> systems = selector.getByContentType(contentType);
        try
        {
            for (Liveness system : systems)
            {
                switch (type)
                {
                    case "http":
                        sendRequestByHttp(system.getHost(), system.getPort(), data, extension);
                        break;
                    case "kafka":
                        sendRequestByKafka(system.getHost(), system.getPort(), data, extension);
                        break;
                    default:
                        throw new IllegalStateException("This type not allowed");
                }
            }
        }
        catch (Throwable e)
        {
            throw new LivenessException("Error occurred while checking liveness");
        }
    }

    public void sendRequestByHttp(String host, int port, byte[] data, Extension extension)
    {
        // some implementation ......
    }

    public void sendRequestByKafka(String host, int port, byte[] data, Extension extension)
    {
        // some implementation ......
    }
}

//        1. Скобочка фигурная перенесена на след строку
//        2. Название ENUM более описательное
//        3. KONTENT_TYPE_MAP получается анонимный класс
//          3.1 Линдт ( тело) лучше вынести в конструктор 56:10
//          3.2 KONTENT_TYPE_MAP можно static
//	        3.3  TreeMup если не критичен использовать обычных HashMap навесить модификатор модифаебл май и караптед потому что она не меняется
//        4. KONTENT_TYPE_MAP лучше private, отдавать через геттеры  (спринцовке сервисы не подразумеваются для паблик методов)
//        5. Autowired надо инжектить через конструктор  (если одно поле можно через автовайред)
//          5.1 Разница между Autowired и конструктором
//        а. Производительность (для автовайред используется рефлексия она 10 раз медленнее)
//        б. Удобство тестирования (Винтер подсветит что у конструктора много параметров, скажет что так не делать)
//        7. ChekLivenes String type вынести в ENUM либо в отдельную модель ContentType или отдельный SystemType
//        8. Нет случая когда ContentType null, учесть случай либо навесить NonNull
//        9. Блок try/catch большой, вынести в отдельный метод
//        10. Исключение проглатывается в Thrwable есть конструктор принимающий cause, который chain exception делает
//        11. Switch строки заменить на ENUM
//        12. В switch sendRequestByHttp Использовать паттерн стратегия
//        13. Throwable отлавливает error в том числе это излишне
//        14. На практике джава доки не пишут
//        15. Автозаполнение через искусственны интеллект Кодовая база большая Не учитывает специфичный код стайл проекта (внутренняя модель для генерации тестов )
