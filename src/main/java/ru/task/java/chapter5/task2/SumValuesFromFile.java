package ru.task.java.chapter5.task2;

import ru.task.java.chapter5.task1.FileReaderCustom;
import ru.task.java.chapter5.task1.FloatPointNumber;

public final class SumValuesFromFile {

    public static double sumOfValues(String filename) throws Exception {
        return FloatPointNumber.readValues(FileReaderCustom.getDirectories(filename)).stream().mapToDouble(Double::valueOf).sum();
    }
}
