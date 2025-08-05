package ru.task.java.chapter6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Table<K, V> {

    private final List<Entry<K, V>> list = new ArrayList<>();

    public V get(K k) {
        return Objects.requireNonNull(
                list.stream().filter(
                        entry -> entry.k().equals(k)
                ).findFirst().orElse(null)
        ).v();
    }

    public void put(K k, V v) {
        list.stream().filter(entry -> entry.k().equals(k)).findFirst().ifPresentOrElse(
                entry -> {
                    list.remove(entry);
                    list.add(new Entry<>(k, v));
                },
                () -> list.add(new Entry<>(k, v))
        );
    }

    public void remove(K k) {
        list.stream().filter(
                entry -> entry.k().equals(k)
        ).findFirst().ifPresent(
                list::remove
        );
    }
}
