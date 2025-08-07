package ru.task.java.chapter6.task10;

import org.junit.jupiter.api.Test;
import ru.task.java.chapter6.task9.Arrays;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysTest {

    @Test
    public void maxInPairArraysTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(Arrays.findMax(list), 4);
    }

    @Test
    public void minInPairArraysTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        assertEquals(Arrays.findMin(list), "1");
    }
}
