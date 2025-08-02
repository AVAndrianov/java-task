package ru.task.java.chapter6.task12;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxTest {
    LargestSmallest largestSmallest = new LargestSmallest();

    @Test
    public void minMaxTest() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("1");
        list.add("22");
        list.add("333");
        list.add("4444");
        list.add("55555a");
        list.add("55555A");
        LargestSmallest.minmax(list, Comparator.naturalOrder(), list2);
    }

}
