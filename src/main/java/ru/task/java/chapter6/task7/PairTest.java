package ru.task.java.chapter6.task7;

import org.junit.Test;

public class PairTest {

    @Test
    public void createPair() {
        Pair<String> pair = new Pair<>("Hello", "World");
        assert pair.getE1().equals("Hello") && pair.getE2().equals("World");
    }
}
