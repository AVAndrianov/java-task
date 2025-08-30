package ru.task.java.chapter7.task7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public final class ReadingAllWords {

    private ReadingAllWords() {
        throw new UnsupportedOperationException();
    }

    public static TreeMap<String, Integer> readingAllWords(File file) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        treeMap.put(word, treeMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return treeMap;
    }
}
