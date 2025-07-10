package ru.task.java.chapter6.task2;

import ru.task.java.chapter6.task1.Stack;

import java.util.Arrays;
import java.util.Objects;

public class StackE<E> implements Stack<E> {

    E[] arr;
    private double loadFactor = 0.75;
    private int loadIndex = 0;

    @Override
    public void push(E e) {
        if (arr == null) {
            arr = (E[]) new Object[10];
        } else if (loadIndex >= arr.length / loadIndex) {
            E[] tempArr = Arrays.copyOf(arr, arr.length * 2, (Class<? extends E[]>) arr.getClass());
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            arr = tempArr;
        }
        arr[loadIndex++] = e;
    }

    @Override
    public E pop() {
        E e = arr[--loadIndex];
        arr[loadIndex] = null;
        return e;
    }

    @Override
    public boolean isEmpty() {
        return Arrays.stream(arr).filter(Objects::nonNull).findAny().isEmpty();
    }

    public E[] getArr() {
        return arr;
    }
}
