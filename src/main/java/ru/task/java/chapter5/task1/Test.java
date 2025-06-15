package ru.task.java.chapter5.task1;

import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) throws IllegalArgumentException, FileNotFoundException {
        FloatPointNumber.readValues("listDoubleNumber.txt").forEach(System.out::println);
    }
}
