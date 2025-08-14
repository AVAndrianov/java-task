package ru.task.java.chapter7.task1;

import org.junit.jupiter.api.Test;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OverviewPrimeNumbersTest {

    @Test
    public void getHashSetTest() {

        Set<Integer> hashSet = new HashSet<>();
        for (int i = 2; i < 100; i++) {
            hashSet.add(i);
        }

        Set<Integer> result = HashBitSet.getHashSet(hashSet);

        assertTrue(result.contains(13));
        assertFalse(result.contains(6));
        assertTrue(hashSet.containsAll(result));
    }

    @Test
    public void getBitSetTest() {

        BitSet bitSet = new BitSet();
        for (int i = 2; i < 100; i++) {
            bitSet.set(i);
        }

        BitSet result = HashBitSet.getBitSet(bitSet);

        assertTrue(result.get(13));
        assertFalse(result.get(6));
    }
}
