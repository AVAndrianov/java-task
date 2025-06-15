package ru.task.java.chapter5.task4;

import ru.task.java.chapter5.task1.FloatPointNumber;
import ru.task.java.chapter5.task2.SumValuesFromFile;

import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        //Что такое возврат кодов ошибок
        SumValuesFromFile.sumOfValues("listDoubleNumber.txt");
        FloatPointNumber.readValues("listDoubleNumber.txt").forEach(System.out::println);
    }
}
