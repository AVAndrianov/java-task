package ru.task.java.chapter6.task14;

import java.io.IOException;
import java.util.ArrayList;

public class ImprovedVersionCloseAllMethod {


    public static <E extends AutoCloseable> void closeAll(ArrayList<E> elems)
            throws Exception {
        for (E elem : elems) elem.close();
    }

    static class MyResource implements AutoCloseable {
        @Override
        public void close() throws IOException {
            throw new IOException();
//            System.out.println("Closing MyResource");
        }
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

