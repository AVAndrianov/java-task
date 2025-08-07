package ru.task.java.chapter6.task8;

public record Pair<E extends Comparable<? super E>>(E e1, E e2) {

    public E max() {
        return e1.compareTo(e2) > 0 ? e1 : e2;
    }

    public E min() {
        return e1.compareTo(e2) > 0 ? e2 : e1;

    }
}
