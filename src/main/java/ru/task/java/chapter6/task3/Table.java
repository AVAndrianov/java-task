package ru.task.java.chapter6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Table<K, V> {

    private final List<Entry<K, V>> list = new ArrayList<>();

    public V get(K k) {
        for (Entry<K, V> entry : list) {
            if (Objects.equals(entry.k(), k)) {
                return entry.v();
            }
        }
        return null;
    }

    public void put(K k, V v) {
        remove(k);
        list.add(new Entry<>(k, v));
    }

    public void remove(K k) {
        list.removeIf(entry -> Objects.equals(entry.k(), k));
    }
}
