package ru.task.java.chapter7.task5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RearrangementOfElementsTest {

    private static Integer[] array;

    @BeforeAll
    static void setUp() {
        array = new Integer[]{3, 2, 1};
    }

    @Test
    void rearrangementOfElementsWithoutRandomAccessTest() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        //Тут приводим к типу Integer.
        List<Integer> result = (List<Integer>) RearrangementOfElements.swap(list, 0, 2);

        assertTrue(list.containsAll(result));
        assertEquals(list.toString(), Arrays.toString(array));
        assertEquals(result.toString(), Arrays.toString(array));
    }

    @Test
    void rearrangementOfElementsWithRandomAccessTest() {
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3));

        //Тут приводим к типу Integer.
        List<Integer> result = (List<Integer>) RearrangementOfElements.swap(linkedList, 0, 2);

        assertTrue(linkedList.containsAll(result));
        assertEquals(result.toString(), Arrays.toString(array));
        assertEquals(linkedList.toString(), Arrays.toString(array));
    }
}
