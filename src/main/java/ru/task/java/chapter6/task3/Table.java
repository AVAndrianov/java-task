package ru.task.java.chapter6.task3;

import java.util.HashMap;
import java.util.Map;

public class Table<K, V> {

    Map<K, V> map = new HashMap<>();

    public void add(K k, V v) {
        map.put(k, v);
    }

    public void put(K k, V v) {
        map.put(k, v);
    }

    public void remove(K k) {
        map.remove(k);
    }

    public Map<K, V> getMap() {
        return map;
    }
}
