package ru.task.java.chapter5.task3;

import ru.task.java.chapter5.task2.SumValuesFromFile;

import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) {
        try {
            SumValuesFromFile.sumOfValues("listDoubleNumber.txt");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
