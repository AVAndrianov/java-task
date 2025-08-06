package ru.task.java.chapter6.task4;

import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {

    private final List<Entry<K, V>> list = new ArrayList<>();

    public void add(K k, V v) {
        list.add(new Entry<>(k, v));
    }

    public void put(K k, V v) {
        list.stream().filter(
                entry -> entry.getK() == k
        ).findFirst().ifPresentOrElse(
                entry -> entry.setV(v),
                () -> list.add(new Entry<>(k, v))
        );
    }

    public void remove(K k) {
        list.stream().filter(entry -> entry.getK() == k).findFirst().ifPresent(list::remove);
    }

    public List<Entry<K, V>> getList() {
        return list;
    }

    public static class Entry<K, V> {
        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }

        private K k;
        private V v;

        public K getK() {
            return k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }
    }
}
