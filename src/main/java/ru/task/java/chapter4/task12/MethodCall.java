package ru.task.java.chapter4.task12;

import java.time.Instant;

public class MethodCall {

    public static void print() {
    }

    public static void main(String[] args) throws Exception {

        // Скорость выполнения метода отличается в среднем в 10 раз
        Instant instant;

        // Прямой вызов 7e-6
        instant = Instant.now();
        MethodCall.print();
        System.out.println(java.time.Duration.between(instant, Instant.now()).toNanosPart());

        // Рефлексия 7e-5
        instant = Instant.now();
        MethodCall.class.getMethod("print").invoke(null);
        System.out.println(java.time.Duration.between(instant, Instant.now()).toNanosPart());
    }
}
