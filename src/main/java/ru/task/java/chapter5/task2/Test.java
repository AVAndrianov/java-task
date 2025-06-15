package ru.task.java.chapter5.task2;

import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {
        System.out.println(SumValuesFromFile.sumOfValues("listDoubleNumber.txt"));
    }
}
