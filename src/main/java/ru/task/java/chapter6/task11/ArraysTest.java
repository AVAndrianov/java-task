package ru.task.java.chapter6.task11;

import org.junit.jupiter.api.Test;
import ru.task.java.chapter6.task9.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;

public class ArraysTest {

    @Test
    public void minMaxArraysTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        assertEquals(Arrays.minMax(list).e1(),1);
        assertEquals(Arrays.minMax(list).e2(),4);
    }
}
