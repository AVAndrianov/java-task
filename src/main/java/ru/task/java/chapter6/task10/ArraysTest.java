package ru.task.java.chapter6.task10;

import org.junit.Test;

import java.util.ArrayList;

public class ArraysTest {

    @Test
    public void maxInPairArraysTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assert new Arrays().firstLast(list).max().toString().equals("4");
    }

    @Test
    public void minInPairArraysTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        assert new Arrays().firstLast(list).min().toString().equals("1");
    }
}
