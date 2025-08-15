package ru.task.java.chapter7.task3;


import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DifferenceTwoSetsTest {

    @Test
    public void unionTwoSetsTest() {
        Set<Integer> set1 = new LinkedHashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(List.of(1, 4, 5));

        Set<Integer> result = DifferenceTwoSets.unionTwoSets(set1, set2);

        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(4));
        assertTrue(result.contains(5));
        assertFalse(result.contains(6));
    }

    @Test
    public void intersectionTwoSetsTest() {
        Set<Integer> set1 = new LinkedHashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(List.of(1, 4, 5));

        Set<Integer> result = DifferenceTwoSets.intersectionTwoSets(set1, set2);

        assertTrue(result.contains(1));
        assertFalse(result.contains(2));
        assertFalse(result.contains(3));
        assertFalse(result.contains(4));
        assertFalse(result.contains(5));
        assertFalse(result.contains(6));
    }

    @Test
    public void differenceTwoSetsTest() {
        Set<Integer> set1 = new LinkedHashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(List.of(1, 4, 5));

        Set<Integer> result = DifferenceTwoSets.differenceTwoSets(set1, set2);

        assertFalse(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(4));
        assertTrue(result.contains(5));
        assertFalse(result.contains(6));
    }
}
