package ru.task.java.chapter7.task7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ReadingAllWords {

    public static void main(String[] args) throws IOException {
        try(BufferedReader bf = new BufferedReader(new FileReader("ReadingAllWords.txt"))) {

            TreeMap<String, Integer> treeMap = bf.lines().collect(
                    Collectors.toMap(
                            String::valueOf, i -> 1, Integer::sum, TreeMap::new
                    )
            );
            treeMap.entrySet().forEach(System.out::println);
        }
    }
}
