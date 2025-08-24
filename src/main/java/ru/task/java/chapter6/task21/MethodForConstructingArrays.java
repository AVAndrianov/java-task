package ru.task.java.chapter6.task21;

import java.lang.reflect.Array;

public class MethodForConstructingArrays {

    public static void main(String[] args) {
        Integer[] result = construct(10, 1);
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        System.out.println(java.util.Arrays.toString(result));
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public static <T> T[] construct(int length, T... dummy) {
        if (dummy.length == 0) {
            throw new IllegalArgumentException("");
        }
        Class<?> clazz = dummy.getClass().getComponentType();
        return (T[]) Array.newInstance(clazz, length);
    }
}
