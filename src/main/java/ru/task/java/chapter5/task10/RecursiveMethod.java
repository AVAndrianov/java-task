package ru.task.java.chapter5.task10;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public final class RecursiveMethod {

    public static int factorial(int number) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            if (number <= 1) {
                return number;
            }
            System.out.println(number);
            return number + factorial(number - 1);
        } catch (Exception ex) {
            ex.printStackTrace(new PrintStream(out));
//            ex.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(RecursiveMethod.factorial(4));
    }
}
