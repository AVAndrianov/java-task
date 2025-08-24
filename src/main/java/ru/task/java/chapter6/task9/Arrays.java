package ru.task.java.chapter6.task9;


import ru.task.java.chapter6.task7.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arrays {

    private Arrays() {
    }

    public static <E> Pair<? super E> firstLast(ArrayList<? super E> a) {
        return new Pair<>(a.get(0), a.get(a.size() - 1));
    }

    public static <E extends Comparable<? super E>> Pair<E> minMax(ArrayList<E> a) {
        return new Pair<>(Collections.min(a), Collections.max(a));
    }

    public static <E extends Comparable<? super E>> E findMax(ArrayList<E> a) {
        return Collections.max(a);
    }

    public static <E extends Comparable<? super E>> E findMin(ArrayList<E> a) {
        return Collections.min(a);
    }
}
