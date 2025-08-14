package ru.task.java.chapter7.task1;

import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class HashBitSet {

    public static Set<Integer> getHashSet(Set<Integer> hashSet) {
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

    public static BitSet getBitSet(BitSet bitSet) {
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
}
