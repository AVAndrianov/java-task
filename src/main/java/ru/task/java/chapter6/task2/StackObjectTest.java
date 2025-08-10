package ru.task.java.chapter6.task2;

import org.junit.jupiter.api.Test;

public class StackObjectTest {

    @Test
    public void addElementStack() {
        StackObject stack = new StackObject();
        stack.push("Hello");
        assert !stack.isEmpty();
    }

    @Test
    public void popElementStack() {
        StackObject stack = new StackObject();
        stack.push("Hello");
        stack.push("World");
        assert stack.pop().equals("World");
    }

    @Test
    public void isEmptyElementStack() {
        StackObject stack = new StackObject();
        stack.push("Hello");
        stack.pop();
        assert stack.isEmpty();
    }
}
