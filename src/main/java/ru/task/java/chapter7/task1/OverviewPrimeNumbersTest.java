package ru.task.java.chapter7.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OverviewPrimeNumbersTest {

    private static Integer[] array;

    @BeforeAll
    static void setUp() {
        array = new Integer[]{2, 3, 4, 5, 7, 9, 11, 13};
    }

    @Test
    void getHashSetTest() {
        Set<Integer> result = PrimeNumbers.getPrimeNumbersUntil(14);

        assertEquals(result, new HashSet<>(Arrays.asList(array)));
    }

    @Test
    void getBitSetTest() {
        BitSet result = PrimeNumbers.getPrimeBitUntil(14);

        for (Integer integer : array) {
            assertTrue(result.get(integer));
        }
    }
}
