package ru.task.java.chapter6.task1;

import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void addElementStack() {
        StackManagesListArrays<String> stackManagesListArrays = new StackManagesListArrays<>();
        stackManagesListArrays.push("Hello");
        assert !stackManagesListArrays.isEmpty();
    }

    @Test
    public void popElementStack() {
        StackManagesListArrays<String> stackManagesListArrays = new StackManagesListArrays<>();
        stackManagesListArrays.push("Hello");
        stackManagesListArrays.push("World");
        assert stackManagesListArrays.pop().equals("World");
    }

    @Test
    public void isEmptyElementStack() {
        StackManagesListArrays<String> stackManagesListArrays = new StackManagesListArrays<>();
        stackManagesListArrays.push("Hello");
        stackManagesListArrays.pop();
        assert stackManagesListArrays.isEmpty();
    }
}
