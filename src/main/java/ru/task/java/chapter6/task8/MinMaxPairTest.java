package ru.task.java.chapter6.task8;

import org.junit.jupiter.api.Test;

public class MinMaxPairTest {

    @Test
    public void maxElementOfPair() {
        Pair<String> pair = new Pair<>("Hello", "World");
        assert pair.max().equals("World");
    }

    @Test
    public void minElementOfPair() {
        Pair<String> pair = new Pair<>("Hello", "World");
       assert  pair.min().equals("Hello");
    }
}
