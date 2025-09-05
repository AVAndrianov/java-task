package ru.task.java.chapter7.task4;

import java.util.List;

public class AnExceptionOccurs {

    private final List<Integer> list;

    public AnExceptionOccurs(List<Integer> list) {
        this.list = list;
    }

    public void changingCollection() {
        for (Integer number : list) {
            list.add(0, 9);
        }
    }
}
