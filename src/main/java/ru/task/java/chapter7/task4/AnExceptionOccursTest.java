package ru.task.java.chapter7.task4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AnExceptionOccursTest {

    @Test
    void anExceptionOccursCatchExceptionTest() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        AnExceptionOccurs anExceptionOccurs = new AnExceptionOccurs(list);

        assertThrows(ConcurrentModificationException.class, anExceptionOccurs::changingCollection);
    }

    @Test
    void anExceptionOccursCopyOnWriteArrayListTest() {
        List<Integer> list = new CopyOnWriteArrayList<>(List.of(1, 2, 3));

        AnExceptionOccurs anExceptionOccurs = new AnExceptionOccurs(list);

        assertDoesNotThrow(anExceptionOccurs::changingCollection);
    }
}

