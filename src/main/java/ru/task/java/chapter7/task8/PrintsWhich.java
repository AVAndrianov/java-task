package ru.task.java.chapter7.task8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class PrintsWhich {

    private PrintsWhich() {
        throw new UnsupportedOperationException();
    }

    public static Map<String, String> printsWhich(File file) throws IOException {
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            int i = 0;
            Map<String, String> wordToLine = new HashMap<>();
            String line;
            while ((line = bf.readLine()) != null) {
                i++;
                for (String word : line.split("\\s+")) {
                    wordToLine.merge(word, String.valueOf(i), (existing, newVal) -> existing + newVal);
                }
            }
            return wordToLine;
        }
    }
}
