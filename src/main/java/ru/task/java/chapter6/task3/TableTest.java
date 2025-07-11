package ru.task.java.chapter6.task3;

import org.junit.Test;

public class TableTest {

    @Test
    public void addElementTable() {
        Table<Integer, String> table = new Table<>();
        table.add(1, "Hello");
        table.add(2, "Hello");
        table.getList().stream().map(i -> i.getK() + i.getV()).forEach(System.out::println);
        assert table.getList() != null;
    }

    @Test
    public void putElementTable() {
        Table<Integer, String> table = new Table<>();
        table.put(1, "Hello");
        table.put(2, "World");
        table.put(2, "Hello");
        table.put(1, "World");
        assert table.getList().stream()
                .filter(i -> i.getK() == 1).map(Entry::getV).collect(java.util.stream.Collectors.joining())
                .equals("World");
    }

    @Test
    public void removeElementTable() {
        Table<Integer, String> table = new Table<>();
        table.put(1, "Hello");
        table.remove(1);
        assert table.getList().isEmpty();
    }
}
