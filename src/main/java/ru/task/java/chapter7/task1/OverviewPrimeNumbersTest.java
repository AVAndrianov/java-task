package ru.task.java.chapter7.task1;

import org.junit.jupiter.api.Test;

import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class OverviewPrimeNumbersTest {

    @Test
    public void hashSetTest() {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 2; i < 100; i++) {
            hashSet.add(i);
        }
        Iterator<Integer> iterator = hashSet.iterator();
        Integer smallestElement = hashSet.stream().min(Comparator.naturalOrder()).orElseThrow(RuntimeException::new);
        Integer j = 1;
        while (iterator.hasNext()) {
            if (iterator.next() == smallestElement * (smallestElement + j)) {
                j++;
                iterator.remove();
            }
        }
        hashSet.forEach(System.out::println);
    }

    @Test
    public void bitSetTest() {
        BitSet bitSet = new BitSet();
        for (int i = 2; i < 100; i++) {
            bitSet.set(i);
        }
        int smallestElement = bitSet.stream().min().orElseThrow(RuntimeException::new);
        int j = 1;
        for (int i = bitSet.nextSetBit(0); i >= 0; i = bitSet.nextSetBit(i + 1)) {
            if (i == smallestElement * (smallestElement + j)) {
                j++;
                bitSet.clear(i);
            }
        }
        bitSet.stream().forEach(System.out::println);
    }
}
