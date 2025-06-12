package ru.task.java.chapter4.task10;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class IntClassMethod {
    /**
     * Метод выводит список всех методово класса int[]
     * Что такое класс int[] == Array.class
     */
    public static void getIntAllMethod() {
        Class<?> cl = Array.class;
        for (Method m : cl.getDeclaredMethods()) {
            System.out.println(Modifier.toString(m.getModifiers()) + " " +
                    m.getReturnType().getCanonicalName() + " " +
                    m.getName() + Arrays.toString(m.getParameters())
            );
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        IntClassMethod.getIntAllMethod();

    }
}
