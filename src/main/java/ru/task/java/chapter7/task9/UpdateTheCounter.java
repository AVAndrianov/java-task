package ru.task.java.chapter7.task9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public final class UpdateTheCounter {

    private UpdateTheCounter() {
        throw new UnsupportedOperationException();
    }

    public static Map<String, Integer> processFile(File file, BiConsumer<Map<String, Integer>, String> update) {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        update.accept(map, word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static Map<String, Integer> printsWhichGetOrDefault(File file) {
        return processFile(file, (map, word) -> {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        });
    }

    public static Map<String, Integer> printsWhichContains(File file) {
        return processFile(file, (map, word) -> {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        });
    }

    public static Map<String, Integer> printsWhichGet(File file) {
        return processFile(file, (map, word) -> {
            if (map.get(word) != null) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        });
    }

    public static Map<String, Integer> printsWhichPutIfAbsent(File file) {
        return processFile(file, (map, word) -> {
            if (map.get(word) != null) {
                map.put(word, map.get(word) + 1);
            }
            map.putIfAbsent(word, 1);
        });
    }
}
