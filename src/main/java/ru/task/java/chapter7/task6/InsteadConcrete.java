package ru.task.java.chapter7.task6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class InsteadConcrete {

    private InsteadConcrete() {
        throw new UnsupportedOperationException();
    }

    public static TreeMap<String, Set<Integer>> getTreeMap(Map<String, Set<Integer>> map) {
        TreeMap<String, Set<Integer>> treeMap = new TreeMap<>(map);
        treeMap.put("1", new LinkedHashSet<>(List.of(1, 2, 3, 1, 4)));
        return treeMap;
    }

    public static HashMap<String, Set<Integer>> getHashMap(Map<String, Set<Integer>> map) {
        HashMap<String, Set<Integer>> hashMap = new HashMap<>(map);
        hashMap.put("1", new LinkedHashSet<>(List.of(1, 2, 3, 1, 4)));
        return hashMap;
    }

    public static LinkedHashMap<String, Set<Integer>> getLinkedHashMap(Map<String, Set<Integer>> map) {
        LinkedHashMap<String, Set<Integer>> linkedHashMap = new LinkedHashMap<>(map);
        linkedHashMap.put("1", new LinkedHashSet<>(List.of(1, 2, 3, 1, 4)));
        return linkedHashMap;
    }
}
