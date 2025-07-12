package ru.task.java.chapter6.task10;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays<E extends Comparable<E>> {

    public <T> Pair<E> firstLast(ArrayList<E> a) {
        return new Pair<>(a.get(0), a.get(a.size() - 1));
    }

    public <T> Pair<E> minMax(ArrayList<E> a) {
        return new Pair<>(Collections.min(a), Collections.max(a));
    }

    public class Pair<E extends Comparable<E>> {

        private E e1;
        private E e2;

        public Pair(E e1, E e2) {
            this.e1 = e1;
            this.e2 = e2;
        }

        public E getE1() {
            return e1;
        }

        public void setE1(E e1) {
            this.e1 = e1;
        }

        public E getE2() {
            return e2;
        }

        public void setE2(E e2) {
            this.e2 = e2;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "e1=" + e1 +
                    ", e2=" + e2 +
                    '}';
        }

        public E max() {
            return findMax(e1, e2);
        }

        public E min() {
            return findMin(e1, e2);

        }

        public static <E extends Comparable<E>> E findMax(E a, E b) {
            return a.compareTo(b) > 0 ? a : b;
        }

        public static <E extends Comparable<E>> E findMin(E a, E b) {
            return a.compareTo(b) > 0 ? b : a;
        }
    }

}
