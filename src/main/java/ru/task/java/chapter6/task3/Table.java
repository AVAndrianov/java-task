package ru.task.java.chapter6.task3;

import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {

    List<Entry<K, V>> list = new ArrayList<>();

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
}
