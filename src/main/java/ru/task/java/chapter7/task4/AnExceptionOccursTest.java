package ru.task.java.chapter7.task4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AnExceptionOccursTest {

    @Test
    public void anExceptionOccursCatchExceptionTest() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        new Thread(new AnExceptionOccurs(list)).start();

        assertThrows(ConcurrentModificationException.class, () -> {
            for (Integer number : list) {
                Thread.sleep(300);
            }
        });
    }

    @Test
    public void anExceptionOccursSynchronizedListTest() {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>(List.of(1, 2, 3)));

        new Thread(new AnExceptionOccurs(list)).start();

        assertDoesNotThrow(() -> {
            synchronized (list) {
                for (Integer number : list) {
                    Thread.sleep(300);
                }
            }
        });
    }

    @Test
    public void anExceptionOccursCopyOnWriteArrayListTest() {
        List<Integer> list = new CopyOnWriteArrayList<>(List.of(1, 2, 3));

        new Thread(new AnExceptionOccurs(list)).start();

        assertDoesNotThrow(() -> {
            for (Integer number : list) {
                Thread.sleep(300);
            }
        });
    }
}
