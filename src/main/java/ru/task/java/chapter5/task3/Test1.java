package ru.task.java.chapter5.task3;

import org.junit.jupiter.api.Test;
import ru.task.java.chapter5.task1.FloatPointNumber;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test1 {

    Path tempFile = Files.createTempFile("test", ".txt");

    public Test1() throws IOException {
    }

    @Test
    void numberValueIsDouble() throws IOException {
        Files.writeString(tempFile, "2.2d");
        File file = tempFile.toFile();
        assertDoesNotThrow(() -> {
            FloatPointNumber.readValues(file);
        }, "Было введено формат double, ожидался формат double.");
        assert FloatPointNumber.readValues(file) != null;
        ArrayList<Double> list = FloatPointNumber.readValues(file);
        assert list.contains(2.2);
    }

    @Test
    void numberValueNotDouble() throws IOException {
        Files.writeString(tempFile, "2");
        File file = tempFile.toFile();
        assertThrows(
                NumberFormatException.class,
                () -> FloatPointNumber.readValues(file),
                "Было введено целочисленное значение, ожидался формат double."
        );
    }

    @Test
    void numberValueIsFloat() throws IOException {
        Files.writeString(tempFile, "2.2f");
        File file = tempFile.toFile();
        assertThrows(
                NumberFormatException.class,
                () -> FloatPointNumber.readValues(file),
                "Был формат float, ожидался формат double."
        );
    }

    @Test
    void notNumberValue() throws IOException {
        Files.writeString(tempFile, "test");
        File file = tempFile.toFile();
        assertThrows(
                NumberFormatException.class,
                () -> FloatPointNumber.readValues(file),
                "Был введен текст, ожидался формат double."
        );
    }
}
