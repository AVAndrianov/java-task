package ru.task.java.chapter6.task2;

import ru.task.java.chapter6.task1.Stack;

import java.util.Arrays;
import java.util.Objects;

public class StackObject<E> implements Stack<Object> {

    Object[] arr;
    private double loadFactor = 0.75;
    private int loadIndex = 0;

    @Override
    public void push(Object e) {
        if (arr == null) {
            arr = new Object[10];
        } else if (loadIndex >= arr.length / loadIndex) {
            Object[] tempArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            arr = tempArr;
        }
        arr[loadIndex++] = e;
    }

    @Override
    public Object pop() {
        Object e = arr[--loadIndex];
        arr[loadIndex] = null;
        return e;
    }

    @Override
    public boolean isEmpty() {
        return Arrays.stream(arr).filter(Objects::nonNull).findAny().isEmpty();
    }

    public Object[] getArr() {
        return arr;
    }
}
