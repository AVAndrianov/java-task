package ru.task.java.chapter7.task1;

import org.junit.jupiter.api.Test;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntConsumer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OverviewPrimeNumbersTest {

    @Test
    void getHashSetTest() {
        Set<Integer> hashSet = new HashSet<>();
        fillRange(2, 100, hashSet::add);

        Set<Integer> result = HashBitSet.getHashSet(hashSet);

        assertTrue(result.contains(13));
        assertFalse(result.contains(6));
        assertTrue(hashSet.containsAll(result));
    }

    @Test
    void getBitSetTest() {
        BitSet bitSet = new BitSet();
        fillRange(2, 100, bitSet::set);

        BitSet result = HashBitSet.getBitSet(bitSet);

        assertTrue(result.get(13));
        assertFalse(result.get(6));
    }

    private static void fillRange(int start, int end, IntConsumer adder) {
        for (int i = start; i < end; i++) {
            adder.accept(i);
        }
    }
}
