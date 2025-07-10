package ru.task.java.chapter5.task4;

import ru.task.java.chapter5.task1.FileReaderCustom;
import ru.task.java.chapter5.task1.FloatPointNumber;

import java.io.FileNotFoundException;

public final class SumValuesFromFile {

    public static double[] sumOfValues(String filename) {
        double sum;
        if (filename == null) {
            return new double[]{-1, 1};
        }
        try {
            sum = FloatPointNumber.readValues(FileReaderCustom.getDirectories(filename))
                    .stream().mapToDouble(Double::valueOf).sum();
        } catch (FileNotFoundException e) {
            return new double[]{-1, 2};
        }
        return new double[]{sum, 0};
    }
}
