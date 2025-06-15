package ru.task.java.chapter5.task3;

import ru.task.java.chapter5.task2.SumValuesFromFile;

import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) {
        try {
            SumValuesFromFile.sumOfValues("listDoubleNumber1.txt");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Task3");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException Task3");
            e.printStackTrace();

        }
    }
}
