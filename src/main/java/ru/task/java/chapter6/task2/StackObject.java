package ru.task.java.chapter6.task2;

import ru.task.java.chapter6.task1.Stack;

public class StackObject implements Stack<Object> {

    private Object[] arr;
    private int loadIndex = 0;

    @Override
    public void push(Object e) {
        if (arr == null) {
            arr = new Object[10];
        } else if (loadIndex + 1 >= arr.length) {
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
        return loadIndex == 0;
    }
}
