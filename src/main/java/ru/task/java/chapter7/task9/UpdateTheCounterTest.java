package ru.task.java.chapter7.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateTheCounterTest {

    private File file;

    @BeforeEach
    public void setUp() throws IOException {
        file = Files.createTempFile("test", "txt").toFile();
        try (FileWriter writer = new FileWriter(file)) {
            writer.append("Напишите программу, которая считывает").append(System.lineSeparator());
            writer.append("все слова в файле и выводит информацию").append(System.lineSeparator());
            writer.append("о том, в какой строке(ах) каждое из них").append(System.lineSeparator());
            writer.append("встречается. Используйте преобразование").append(System.lineSeparator());
            writer.append("строк в множества.").append(System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateTheCounterGetOrDefaultTest() {
        Map<String, Integer> hashMap;

        hashMap = UpdateTheCounter.printsWhichGetOrDefault(file);

        assertEquals(1, hashMap.get("Напишите"));
        assertEquals(3, hashMap.get("в"));
    }

    @Test
    public void updateTheCounterContainsTest() {
        Map<String, Integer> hashMap;

        hashMap = UpdateTheCounter.printsWhichContains(file);

        assertEquals(1, hashMap.get("Напишите"));
        assertEquals(3, hashMap.get("в"));
    }

    @Test
    public void updateTheCounterGetTest() {
        Map<String, Integer> hashMap;

        hashMap = UpdateTheCounter.printsWhichGet(file);

        assertEquals(1, hashMap.get("Напишите"));
        assertEquals(3, hashMap.get("в"));
    }

    @Test
    public void updateTheCounterPutIfAbsentTest() {
        Map<String, Integer> hashMap;

        hashMap = UpdateTheCounter.printsWhichPutIfAbsent(file);

        assertEquals(1, hashMap.get("Напишите"));
        assertEquals(3, hashMap.get("в"));
    }
}
