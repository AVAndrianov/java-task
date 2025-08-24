package ru.task.java.chapter6.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairTest {

    @Test
    public void createStringPair() {
        Pair<String> pair = new Pair<>("Hello", "World");
        assertEquals(pair.e1(), "Hello");
        assertEquals(pair.e2(), "World");
    }

    @Test
    public void createDoublePair() {
        Pair<Double> pair = new Pair<>(0.1, 0.2);
        assertEquals(pair.e1(), 0.1);
        assertEquals(pair.e2(), 0.2);
    }

    @Test
    public void createPair() {
        Pair<Integer> pair = new Pair<>(+0, -0);
        assertEquals(pair.e1(), 0);
        assertEquals(pair.e2(), 0);
    }

    @Test
    public void createDoubleNanPair() {
        Pair<Double> pair = new Pair<>(0.0, Double.NaN);
        assertEquals(pair.e1(), 0.0);
        assertEquals(pair.e2(), Double.NaN);
    }
}
