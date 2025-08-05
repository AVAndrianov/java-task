package ru.task.java.chapter6.task9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysTest {

    @Test
    public void integerArraysTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        assertEquals(Arrays.firstLast(list).e1(), 1);
        assertEquals(Arrays.firstLast(list).e2(), 3);
    }

    @Test
    public void stringArraysTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        assert Arrays.firstLast(list).e1().equals("1")
                && Arrays.firstLast(list).e2().equals("4");
    }

    @Test
    public void objectArraysTest() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(0.1d);
        list.add(0.2F);
        list.add(1);
        list.add(new Object());
        list.add("Hello");
        list.forEach(System.out::println);
        assert Arrays.firstLast(list).e1().equals(0.1)
                && Arrays.firstLast(list).e2().equals("Hello");
    }

    @Test
    public void numberArraysTest() {
        ArrayList<Number> list = new ArrayList<>();
        list.add(0.1d);
        list.add(0.2F);
        list.add(1);
        list.forEach(System.out::println);
        assert Arrays.firstLast(list).e1().equals(0.1)
                && Arrays.firstLast(list).e2().equals(1);
    }
}
