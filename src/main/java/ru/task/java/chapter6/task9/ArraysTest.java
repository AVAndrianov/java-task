package ru.task.java.chapter6.task9;

import org.junit.Test;

import java.util.ArrayList;

public class ArraysTest {

    @Test
    public void integerArraysTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        assert new Arrays().firstLast(list).toString().equals("Pair{e1=1, e2=3}");
    }

    @Test
    public void stringArraysTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        assert new Arrays().firstLast(list).toString().equals("Pair{e1=1, e2=4}");
    }
}
