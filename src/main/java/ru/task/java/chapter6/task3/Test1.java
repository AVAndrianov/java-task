package ru.task.java.chapter6.task3;

import org.junit.Test;

public class Test1 {

    @Test
    public void addElementTable() {
        Table<Integer, String> table = new Table<>();
        table.add(1, "Hello");
        table.add(2, "Hello");
        table.getMap().entrySet().forEach(System.out::println);
        assert table.getMap() != null;
    }

    @Test
    public void putElementTable() {
        Table<Integer, String> table = new Table<>();
        table.put(1, "Hello");
        table.put(1, "World");
        assert table.getMap().get(1).equals("World");
    }

    @Test
    public void removeElementTable() {
        Table<Integer, String> table = new Table<>();
        table.add(1, "Hello");
        table.remove(1);
        assert table.getMap().size() == 0;
    }
}
