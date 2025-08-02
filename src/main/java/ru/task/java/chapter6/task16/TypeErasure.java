package ru.task.java.chapter6.task16;

public class TypeErasure {

    // не нужно явное приведение
    //public static void sort(List<Comparable> list)
    //public static <Т extends Comparable<? super Т>> void sort(List<T> list) {
    //}

    //нужно явное приведение
    //public static Comparable max(Collection<? extends Comparable> coll)
    //public static <T extends Object & Comparable<? super Т>> T max(Collection<? extends T> coll) {
    //}


}
