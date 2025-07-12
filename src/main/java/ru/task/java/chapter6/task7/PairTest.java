package ru.task.java.chapter6.task7;

import org.junit.Test;

public class PairTest {

    @Test
    public void createStringPair() {
        Pair<String> pair = new Pair<>("Hello", "World");
        assert pair.e1().equals("Hello") && pair.e2().equals("World");
    }

    @Test
    public void createDoublePair() {
        Pair<Double> pair = new Pair<>(0.1, 0.2);
        assert pair.e1().equals(0.1) && pair.e2().equals(0.2);
    }

    @Test
    public void createPair() {
        Pair<Integer> pair = new Pair<>(+0, -0);
        assert pair.e1().equals(0) && pair.e2().equals(0);
    }

    @Test
    public void createDoubleNanPair() {
        Pair<Double> pair = new Pair<>(0.0, Double.NaN);
        assert pair.e1().equals(0.0) && pair.e2().equals(Double.NaN);
    }
}
