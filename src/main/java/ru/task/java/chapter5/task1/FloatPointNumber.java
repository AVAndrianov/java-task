package ru.task.java.chapter5.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public final class FloatPointNumber {

    public static File getDirectories(String fileName) {
        String root =
                System.getProperty("user.dir")
                        + System.getProperty("file.separator");
        return new File(root + "src/main/java/ru/task/java/chapter5/task1/" + fileName);
    }

    public static ArrayList<Double> readValues(String fileName) throws FileNotFoundException, IllegalArgumentException {
        //Если файл не удается открыть будет сгенерировано исключение FileNotFoundException автоматически
        if (!getDirectories(fileName).isFile()) {
            throw new FileNotFoundException();
        }
        BufferedReader bf = new BufferedReader(new FileReader(getDirectories(fileName)));
        return bf.lines().peek(i -> {
            //Если данные в файле не являются числом сплавающей точкой кинется исключение IllegalArgumentException
            // реджекс из интернета добавил в него опциональные буквы [fd]? убрал вопрос после \\.
            if (!(i.matches("[-+]?[0-9]*\\.[0-9]+[fd]?+([eE][-+]?[0-9])?"))) {
                throw new NumberFormatException();
            }
        }).map(Double::valueOf).collect(Collectors.toCollection(ArrayList::new));
    }
}
