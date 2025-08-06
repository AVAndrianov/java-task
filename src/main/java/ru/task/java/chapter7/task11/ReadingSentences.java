package ru.task.java.chapter7.task11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReadingSentences {

    public static void main(String[] args) {
        String str = """
                Напишите программу для чтения предложения в списочный массив. Затем перетасуйте
                в массиве все слова, кроме первого и последнего, используя метод
                Collections. shuffle (), но не копируя слова в другую коллекцию.
                """;
        List<String> list = Arrays.stream(str.split(" ")).collect(Collectors.toList());
        Collections.shuffle(list.subList(1, list.size() - 1));
        list.forEach(System.out::println);
    }
}
