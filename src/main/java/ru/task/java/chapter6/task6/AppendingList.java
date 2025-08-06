package ru.task.java.chapter6.task6;

import java.util.Collection;

public final class AppendingList {

    public static <E> void concatListSuper(Collection<? super E> collection1, Collection<E> collection2) {
        collection1.addAll(collection2);
    }

    public static <E> void concatListExtends(Collection<E> collection1, Collection<? extends E> collection2) {
        collection1.addAll(collection2);
    }
}
