package ru.task.java.chapter6.task21;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MethodForConstructingArrays {

    public static void main(String[] args) {
        List<String>[] result = construct(List.class, 10);
        for (int i = 0; i < result.length; i++) {
            result[i] = new ArrayList<>();
        }
        result[0].add("Hello");
        result[1].add("World");
    }

    public static <T> T[] construct(Class<T> clazz, int size) {
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) Array.newInstance(clazz, size);
        return arr;
    }
}
