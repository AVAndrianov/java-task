package ru.task.java.chapter6.task9;


import java.util.ArrayList;

public class Arrays {
    private Arrays() {
    }

    public static <E> Pair<? super E> firstLast(ArrayList<? super E> a) {
        return new Pair<>(a.get(0), a.get(a.size() - 1));
    }

    public static record Pair<E>(E e1, E e2) {
    }
}
