package ru.task.java.chapter7.task6;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InsteadConcrete {

    public static void main(String[] args) {
        Map<String, Set<Integer>> map = new HashMap<>();
        map.put("1",new LinkedHashSet<>(List.of(1,2,3,1,4)));
        map.entrySet().forEach(System.out::println);
    }
}
