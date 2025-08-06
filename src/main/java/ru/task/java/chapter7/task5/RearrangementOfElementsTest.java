package ru.task.java.chapter7.task5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RearrangementOfElementsTest {

    @Test
    public void rearrangementOfElementsTest() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        new RearrangementOfElements().swap(list, 0, 2);
    }
}
