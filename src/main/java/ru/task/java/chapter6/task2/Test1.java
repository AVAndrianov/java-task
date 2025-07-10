package ru.task.java.chapter6.task2;

import org.junit.Test;

public class Test1 {

    @Test
    public void addElementStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        assert !stack.isEmpty();
    }

    @Test
    public void popElementStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        assert stack.pop().equals("World");
    }

    @Test
    public void isEmptyElementStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.pop();
        assert stack.isEmpty();
    }
}
