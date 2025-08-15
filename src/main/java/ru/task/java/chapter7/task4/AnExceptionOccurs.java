package ru.task.java.chapter7.task4;

import java.util.List;

public class AnExceptionOccurs implements Runnable {

    private final List<Integer> list;

    public AnExceptionOccurs(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            for (int i = 4; i < 8; i++) {
                Thread.sleep(100);
                list.add(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
