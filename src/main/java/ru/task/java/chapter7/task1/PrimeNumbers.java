package ru.task.java.chapter7.task1;

import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.IntConsumer;

public final class PrimeNumbers {

    private PrimeNumbers() {
        throw new UnsupportedOperationException();
    }

    public static Set<Integer> getPrimeNumbersUntil(int n) {
        Set<Integer> hashSet = new HashSet<>();
        fillRange(hashSet::add, n);
        if (hashSet.isEmpty()) {
            return hashSet;
        }
        Integer smallestElement = Collections.min(hashSet);
        Integer j = 1;
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(smallestElement * (smallestElement + j))) {
                j++;
                iterator.remove();
            }
        }
        return hashSet;
    }

    public static BitSet getPrimeBitUntil(int n) {
        BitSet bitSet = new BitSet();
        fillRange(bitSet::set, n);
        int smallestElement = bitSet.nextSetBit(0);
        if (smallestElement < 0) {
            return bitSet;
        }
        int j = 1;
        for (int i = bitSet.nextSetBit(0); i >= 0; i = bitSet.nextSetBit(i + 1)) {
            if (i == smallestElement * (smallestElement + j)) {
                j++;
                bitSet.clear(i);
            }
        }
        return bitSet;
    }

    private static void fillRange(IntConsumer adder, int n) {
        for (int i = 2; i < n; i++) {
            adder.accept(i);
        }
    }
}
