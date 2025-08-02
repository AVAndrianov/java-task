package ru.task.java.chapter6.task13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMinTest {

    @Test
    public void maxMinTest() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("1");
        list.add("22");
        list.add("333");
        list.add("4444");
        list.add("55555a");
        list.add("55555A");
        LargestSmallest2.maxmin(list, Comparator.naturalOrder(), list2);
    }
}
