package ru.task.java.chapter6.task1;

import java.util.ArrayList;

public class Stack<E> {

    ArrayList<E> list = new ArrayList<>();

    public void push(E e) {
        list.add(e);
    }

    public E pop() {
        E e = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return e;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
