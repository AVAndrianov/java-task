package ru.task.java.chapter6.task1;

import java.util.ArrayList;

public class StackE<E> implements Stack<E> {

    ArrayList<E> list = new ArrayList<>();

    @Override
    public void push(E e) {
        list.add(e);
    }
    @Override
    public E pop() {
        E e = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return e;
    }
    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }
}
