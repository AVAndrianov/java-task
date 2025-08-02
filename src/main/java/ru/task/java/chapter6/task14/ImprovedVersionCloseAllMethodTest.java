package ru.task.java.chapter6.task14;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

public class ImprovedVersionCloseAllMethodTest {

    @Test
    public void improvedVersionCloseAllMethod() throws Exception {
        ArrayList<ImprovedVersionCloseAllMethod.MyResource> list = new ArrayList<>();
        list.add(new ImprovedVersionCloseAllMethod.MyResource());
        list.add(new ImprovedVersionCloseAllMethod.MyResource());
        list.add(new ImprovedVersionCloseAllMethod.MyResource());
        list.add(new ImprovedVersionCloseAllMethod.MyResource());


        try {
            methodA();
        } catch (MyCustomException e) {
            System.err.println("Caught exception in main: " + e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.err.println("Original cause: " + cause.getMessage());
            }
        }
    }

    static void methodA() throws MyCustomException {
        try {
            methodB();
        } catch (IOException e) {
            throw new MyCustomException("Error in methodA", e); // Связываем исключения
        }
    }

    static void methodB() throws IOException {
        throw new IOException("Failed to read file in methodB");
    }

    static class MyCustomException extends IOException {
        public MyCustomException(String message) {
            super(message);
        }

        public MyCustomException(String message, Throwable cause) {
            super(message, cause); // Вызываем конструктор суперкласса для связывания
        }
    }
}

