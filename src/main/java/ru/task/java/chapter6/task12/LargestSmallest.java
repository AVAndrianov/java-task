package ru.task.java.chapter6.task12;

import java.util.Comparator;
import java.util.List;

public class LargestSmallest {

    public static <E> void minmax(List<E> elements, Comparator<? super E> comp, List<? super E> result) {
        result.add(elements.stream().max(comp).orElse(null));
        result.add(elements.stream().min(comp).orElse(null));
    }
}
