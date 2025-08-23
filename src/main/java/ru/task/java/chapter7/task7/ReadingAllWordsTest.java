package ru.task.java.chapter7.task7;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class ReadingAllWordsTest {

    @Test
    public static void readingAllWordsTest() {
        File file = new File("ReadingAllWords.txt");
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap = ReadingAllWords.readingAllWords(file);


        try (BufferedReader bf = new BufferedReader(new FileReader("ReadingAllWords.txt"))) {
//            TreeMap<String, Integer> treeMap = new TreeMap<>();

            String line;
            while ((line = bf.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        treeMap.put(word, treeMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            for (var entry : treeMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
