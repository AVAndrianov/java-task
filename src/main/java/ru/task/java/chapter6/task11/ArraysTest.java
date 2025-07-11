package ru.task.java.chapter6.task11;

import org.junit.Test;
import ru.task.java.chapter6.task10.Arrays;

import java.util.ArrayList;

public class ArraysTest {

    @Test
    public void minMaxArraysTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        assert new Arrays().minMax(list).toString().equals("Pair{e1=1, e2=4}");
    }
}
