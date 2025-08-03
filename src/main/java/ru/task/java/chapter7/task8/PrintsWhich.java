package ru.task.java.chapter7.task8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintsWhich {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("PrintsWhich.txt"));
        int i = 1;
        Map<Object, Integer> wordToLine = new HashMap<>();
        while (bf.ready()) {
            int finalI = i;
            wordToLine.putAll(Arrays.stream(bf.readLine().split(" "))
                    .map(word -> new AbstractMap.SimpleEntry<Object, Integer>(word, finalI))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue
                    )));
            i++;
        }
        wordToLine.entrySet().forEach(System.out::println);
    }
}
