package ru.task.java.chapter6.task2;

import org.junit.Test;

public class TestObject {

    @Test
    public void addElementStack() {
        StackObject<String> stack = new StackObject<>();
        stack.push("Hello");
        assert !stack.isEmpty();
    }

    @Test
    public void popElementStack() {
        StackObject<String> stack = new StackObject<>();
        stack.push("Hello");
        stack.push("World");
        assert stack.pop().equals("World");
    }

    @Test
    public void isEmptyElementStack() {
        StackObject<String> stack = new StackObject<>();
        stack.push("Hello");
        stack.pop();
        assert stack.isEmpty();
    }
}
