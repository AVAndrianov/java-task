package ru.task.java.chapter7.task4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AnExceptionOccurs {
    //Воспроизведите ситуацию, когда возникает исключение типа ConcurгentModificationException.
    // Что можно предпринять, чтобы избежать этого?
    //CopyOnWriteArrayList
    //Collections.synchronizedList
    @Test
    public void anExceptionOccurs() throws InterruptedException {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(500);
                list.add(4);
                Thread.sleep(500);
                list.add(5);
                Thread.sleep(500);
                list.add(6);
                Thread.sleep(500);
                list.add(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
            Thread.sleep(200);
            size = list.size();
        }
    }
}
