package ru.task.java.chapter5.task2;

import ru.task.java.chapter5.task1.FloatPointNumber;

import java.io.FileNotFoundException;

public final class SumValuesFromFile {

    public static double sumOfValues(String filename) throws FileNotFoundException, IllegalArgumentException {
        FloatPointNumber.readValues(filename).stream().mapToDouble(Double::valueOf).forEach(System.out::println);
        return FloatPointNumber.readValues(filename).stream().mapToDouble(Double::valueOf).sum();
    }
}
