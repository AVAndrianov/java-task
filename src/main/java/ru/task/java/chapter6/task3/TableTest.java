package ru.task.java.chapter6.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TableTest {

    @Test
    public void getElementTable() {
        Table<Integer, String> table = new Table<>();
        table.put(1, "Hello");
        table.put(2, "World");
        assertEquals(table.get(1), "Hello");
        assertEquals(table.get(2), "World");
    }

    @Test
    public void putElementTable() {
        Table<Integer, String> table = new Table<>();
        table.put(1, "Hello");
        table.put(2, "World");
        table.put(2, "Hello");
        table.put(1, "World");
        assertEquals(table.get(2), "Hello");
        assertEquals(table.get(1), "World");
    }

    @Test
    public void removeElementTable() {
        Table<Integer, String> table = new Table<>();
        table.put(1, "Hello");
        table.remove(1);
        assertThrows(NullPointerException.class, () -> {
            table.get(1);
            throw new NullPointerException();
        });
    }

    @Test
    public void removeElementWhichNotTable() {
        Table<Integer, String> table = new Table<>();
        table.put(1, "Hello");
        assertDoesNotThrow(() -> table.remove(2));
    }
}
