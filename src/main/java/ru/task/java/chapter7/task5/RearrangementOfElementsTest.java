package ru.task.java.chapter7.task5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RearrangementOfElementsTest {

    @Test
    void rearrangementOfElementsWithoutRandomAccessTest() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        List<Integer> result = (List<Integer>) RearrangementOfElements.swap(list, 0, 2);

        assertTrue(list.containsAll(result));
        assertEquals(list.get(0), result.get(2));
        assertEquals(list.get(2), result.get(0));
    }

    @Test
    void rearrangementOfElementsWithRandomAccessTest() {
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3));

        List<Integer> result = (List<Integer>) RearrangementOfElements.swap(linkedList, 0, 2);

        assertTrue(linkedList.containsAll(result));
        assertEquals(linkedList.get(0), result.get(2));
        assertEquals(linkedList.get(2), result.get(0));
    }
}
