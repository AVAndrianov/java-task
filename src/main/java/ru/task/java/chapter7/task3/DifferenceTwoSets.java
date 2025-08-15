package ru.task.java.chapter7.task3;


import java.util.LinkedHashSet;
import java.util.Set;

public final class DifferenceTwoSets {

    private DifferenceTwoSets() {
        throw new UnsupportedOperationException();
    }

    public static Set<Integer> unionTwoSets(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        return set1;
    }

    public static Set<Integer> intersectionTwoSets(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public static Set<Integer> differenceTwoSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new LinkedHashSet<>(set1);
        Set<Integer> set4 = new LinkedHashSet<>(set1);
        set3.addAll(set2);
        set4.retainAll(set2);
        set3.removeAll(set4);
        return set3;
    }
}
