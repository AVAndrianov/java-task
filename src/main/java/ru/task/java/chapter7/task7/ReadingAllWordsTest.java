package ru.task.java.chapter7.task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadingAllWordsTest {
    private File file;

    @BeforeEach
    public void setUp() throws IOException {
        file = Files.createTempFile("test", "txt").toFile();
        try (FileWriter writer = new FileWriter(file)) {
            writer.append("1").append(System.lineSeparator());
            writer.append("2").append(System.lineSeparator());
            writer.append("3").append(System.lineSeparator());
            writer.append("1").append(System.lineSeparator());
            writer.append("2").append(System.lineSeparator());
            writer.append("3").append(System.lineSeparator());
            writer.append("4").append(System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readingAllWordsTest() {
        Map<String, Integer> treeMap;

        treeMap = ReadingAllWords.readingAllWords(file);

        assertEquals(2, treeMap.get("1"));
        assertEquals(1, treeMap.get("4"));
    }
}
