package ru.task.java.chapter5.task12;

import java.util.Arrays;

public final class SmallestValue {

    public static int min(int[] values) {
        long nanoTime = System.nanoTime();
        int minValue = Arrays.stream(values).min().orElse(-2);
        assert Arrays.stream(values).allMatch(i -> i >= minValue);
        System.out.println("Разрешение-nanoTime: " + (System.nanoTime() - nanoTime));

        nanoTime = System.nanoTime();
        int minValue2 = Arrays.stream(values).min().orElse(-2);
        Arrays.stream(values).allMatch(i -> i >= minValue2);
        System.out.println("Запрещено-nanoTime : " + (System.nanoTime() - nanoTime));


        nanoTime = System.nanoTime();
        int minValue3 = Arrays.stream(values).min().orElse(-2);
        System.out.println("Исключено-nanoTime : " + (System.nanoTime() - nanoTime));

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(SmallestValue.min(arr));
    }
}
