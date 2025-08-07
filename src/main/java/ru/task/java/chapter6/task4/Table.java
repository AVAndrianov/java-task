package ru.task.java.chapter6.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Table<K, V> {

    private final List<Entry<K, V>> list = new ArrayList<>();

    public V get(K k) {
        for (Entry<K, V> entry : list) {
            if (Objects.equals(entry.getK(), k)) {
                return entry.getV();
            }
        }
        return null;
    }

    public void put(K k, V v) {
        for (Entry<K, V> entry : list) {
            if (Objects.equals(entry.getK(), k)) {
                entry.setV(v);
                return;
            }
        }
        list.add(new Entry<>(k, v));
    }

    public void remove(K k) {
        list.removeIf(
                entry -> Objects.equals(entry.getK(), k)
        );
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
