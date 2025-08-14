package ru.task.java.chapter7.task8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class PrintsWhich {


    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        String printswhichUrl = null;
        try (FileInputStream fis = new FileInputStream("src/main/resources/application.properties")) {
            props.load(fis);
            printswhichUrl = props.getProperty("printswhich.url");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert printswhichUrl != null;
        try (BufferedReader bf = new BufferedReader(new FileReader(printswhichUrl))) {
            int[] i = {1};
            Map<Object, Integer> wordToLine = new HashMap<>();
            String line;
            while ((line = bf.readLine()) != null) {
                wordToLine.putAll(Arrays.stream(line.split(" "))
                        .map(word -> new AbstractMap.SimpleEntry<Object, Integer>(word, i[0]++))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue
                        )));
            }
            wordToLine.entrySet().forEach(System.out::println);
        }
    }
}
