package ru.task.java.chapter6.task8;

import org.junit.Test;
import ru.task.java.chapter6.task7.Pair;

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
