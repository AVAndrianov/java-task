package ru.task.java.chapter6.task2;

import org.junit.Test;

public class StackTest {

    @Test
    public void addElementStack() {
        StackE<String> stackE = new StackE<>();
        stackE.push("Hello");
        assert !stackE.isEmpty();
    }

    @Test
    public void popElementStack() {
        StackE<String> stackE = new StackE<>();
        stackE.push("Hello");
        stackE.push("World");
        assert stackE.pop().equals("World");
    }

    @Test
    public void isEmptyElementStack() {
        StackE<String> stackE = new StackE<>();
        stackE.push("Hello");
        stackE.pop();
        assert stackE.isEmpty();
    }
}
