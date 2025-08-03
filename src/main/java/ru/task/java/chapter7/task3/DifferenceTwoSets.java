package ru.task.java.chapter7.task3;


import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DifferenceTwoSets {
    //Как вычислить объединение, пересечение и разность двух множеств, используя
    //только методы из интерфейса Set, но не организуя циклы?
    @Test
    public void unionTwoSets() {
        Set<Integer> set1 = new LinkedHashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(List.of(1, 4, 5));
        set1.addAll(set2);
        assert set1.contains(1);
        assert set1.contains(2);
        assert set1.contains(3);
        assert set1.contains(4);
        assert set1.contains(5);
        assert !set1.contains(6);
    }

    @Test
    public void intersectionTwoSets() {
        Set<Integer> set1 = new LinkedHashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(List.of(1, 4, 5));
        set1.retainAll(set2);
        set1.forEach(System.out::println);
        assert set1.contains(1);
        assert !set1.contains(2);
        assert !set1.contains(3);
        assert !set1.contains(4);
        assert !set1.contains(5);
        assert !set1.contains(6);
    }
    @Test
    public void differenceTwoSets() {
        Set<Integer> set1 = new LinkedHashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(List.of(1, 4, 5));
        Set<Integer> set3 = new LinkedHashSet<>(set1);
        Set<Integer> set4 = new LinkedHashSet<>(set1);
        set3.addAll(set2);
        set4.retainAll(set2);
        set3.removeAll(set4);
        assert !set3.contains(1);
        assert set3.contains(2);
        assert set3.contains(3);
        assert set3.contains(4);
        assert set3.contains(5);
        assert !set3.contains(6);
    }

}
