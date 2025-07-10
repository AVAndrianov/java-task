package ru.task.java.chapter6.task4;

import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {

    private List<Entry<K, V>> list = new ArrayList<>();

    public void add(K k, V v) {
        list.add(new Entry<>(k, v));
    }

    public void put(K k, V v) {
        list.stream().filter(entry -> entry.getK() == k).findFirst().ifPresentOrElse(
                entry -> entry.setV(v),
                () -> list.add(new Entry<>(k, v))
        );
    }

    public void remove(K k) {
        list.stream().filter(entry -> entry.getK() == k).findFirst().ifPresent(
                entry -> list.remove(entry)
        );
    }

    public List<Entry<K, V>> getList() {
        return list;
    }

    static class Entry<K, V> {
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

        public void setK(K k) {
            this.k = k;
        }

        public void setV(V v) {
            this.v = v;
        }
    }
}
