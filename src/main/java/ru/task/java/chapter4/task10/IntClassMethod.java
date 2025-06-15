package ru.task.java.chapter4.task10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class IntClassMethod {
    /**
     * int[].class возвращает 0 декларированных методов
     * не декларированные возвращаются методы класса Object
     */

    private static void print(Method[] ms) {
        for (Method m : ms) {
            System.out.println(Modifier.toString(m.getModifiers()) + " " +
                    m.getReturnType().getCanonicalName() + " " +
                    m.getName() + Arrays.toString(m.getParameters())
            );
        }
    }

    public static void main(String[] args) {
        Class<?> cl = int[].class;
        print(cl.getDeclaredMethods());
        print(cl.getMethods());
    }
}
