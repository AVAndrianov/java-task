package ru.task.java.chapter4.task12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodCall {

    public static void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /**
         * Отличия в производительности
         */
        long date;
        MethodCall methodCall = new MethodCall();
        Method method = methodCall.getClass().getMethod("print");
        /**
         * Рефлексия
         */
        date = System.currentTimeMillis();
        method.invoke(methodCall);
        System.out.println(System.currentTimeMillis() - date);

        /**
         * Прямой вызов
         */
        date = System.currentTimeMillis();
        MethodCall.print();
        System.out.println(System.currentTimeMillis() - date);
    }
}
