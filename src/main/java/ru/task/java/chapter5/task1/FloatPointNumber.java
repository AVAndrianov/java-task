package ru.task.java.chapter5.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public final class FloatPointNumber {

    public static ArrayList<Double> readValues(File file) throws FileNotFoundException, IllegalArgumentException {
        BufferedReader bf = new BufferedReader(new FileReader(file));
        return bf.lines().peek(number -> {
            if (!(number.matches("[-+]?[0-9]*\\.[0-9]+[d]?+([eE][-+]?[0-9])?"))) {
                throw new NumberFormatException();
            }
        }).map(Double::valueOf).collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) throws Exception {
        FloatPointNumber.readValues(FileReaderCustom.getDirectories("listDoubleNumber.txt")).forEach(System.out::println);
    }
}
