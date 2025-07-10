package ru.task.java.chapter5.task7;

import java.io.IOException;
import java.io.InputStream;

public final class ErrorClosingResource extends InputStream {
    @Override
    public int read()  {
        System.out.println("read");

        try {
            throw new IOException("Ошибка чтения из потока");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public void close() {
        System.out.println("close");
        try {
            throw new IOException("Имитация ошибки при закрытии");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
