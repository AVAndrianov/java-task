package ru.task.java.chapter6.task4;

import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {

    private final List<Entry> list = new ArrayList<>();

    public void add(K k, V v) {
        list.add(new Entry(k, v));
    }

    public void put(K k, V v) {
        list.stream().filter(entry -> entry.getK() == k).findFirst().ifPresentOrElse(
                entry -> entry.setV(v),
                () -> list.add(new Entry(k, v))
        );
    }

    public void remove(K k) {
        list.stream().filter(entry -> entry.getK() == k).findFirst().ifPresent(list::remove);
    }

    public List<Entry> getList() {
        return list;
    }

    public static class Entry {
        public Entry(Object k, Object v) {
            this.k = k;
            this.v = v;
        }

        private Object k;
        private Object v;

        public Object getK() {
            return k;
        }

        public void setK(Object k) {
            this.k = k;
        }

        public Object getV() {
            return v;
        }

        public void setV(Object v) {
            this.v = v;
        }
    }
}
