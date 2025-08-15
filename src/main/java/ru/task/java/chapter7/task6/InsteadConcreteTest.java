package ru.task.java.chapter7.task6;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsteadConcreteTest {

    @Test
    public void getTreeMapTest() {
        Map<String, Set<Integer>> treeMap = new TreeMap<>();

        Map<String, Set<Integer>> map = InsteadConcrete.getTreeMap(treeMap);

        assertNotNull(map);
        assertInstanceOf(TreeMap.class, map);
        assertTrue(map.entrySet().toString().contains("[1=[1, 2, 3, 4]]"));
        assertTrue(map.get("1").contains(4));
    }

    @Test
    public void getHashMapTest() {
        Map<String, Set<Integer>> hashMap = new HashMap<>();

        Map<String, Set<Integer>> map = InsteadConcrete.getHashMap(hashMap);

        assertNotNull(map);
        assertInstanceOf(HashMap.class, map);
        assertTrue(map.entrySet().toString().contains("[1=[1, 2, 3, 4]]"));
        assertTrue(map.get("1").contains(4));
    }

    @Test
    public void getLinkedHashMapTest() {
        Map<String, Set<Integer>> linkedHashMap = new LinkedHashMap<>();

        Map<String, Set<Integer>> map = InsteadConcrete.getLinkedHashMap(linkedHashMap);

        assertNotNull(map);
        assertInstanceOf(LinkedHashMap.class, map);
        assertTrue(map.entrySet().toString().contains("[1=[1, 2, 3, 4]]"));
        assertTrue(map.get("1").contains(4));
    }
}
