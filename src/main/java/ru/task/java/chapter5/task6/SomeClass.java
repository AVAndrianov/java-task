package ru.task.java.chapter5.task6;

import ru.task.java.chapter5.task1.FileReaderCustom;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public final class SomeClass {

    public static void someMethod() {
        try (BufferedReader in = Files.newBufferedReader(
                FileReaderCustom.getDirectories("listDoubleNumber.txt").toPath(), StandardCharsets.UTF_8)) {
            in.lines().forEach(System.out::println);
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }

    public static void catchingExceptionFinale() {
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(
                    FileReaderCustom.getDirectories("listDoubleNumber.txt").toPath(), StandardCharsets.UTF_8);
            in.lines().forEach(System.out::println);
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close(); // ВНИМАНИЕ: может быть сгенерировано исключение!
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void implementTryFinaleInTryCatch() {
        BufferedReader in = null;
        try {
            try {
                in = Files.newBufferedReader(
                        FileReaderCustom.getDirectories("listDoubleNumber.txt").toPath(), StandardCharsets.UTF_8);
                in.lines().forEach(System.out::println);
            } finally {
                try {
                    if (in != null) {
                        in.close(); // ВНИМАНИЕ: может быть сгенерировано исключение!
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }


    public static void main(String[] args) {
        SomeClass.someMethod();
        SomeClass.catchingExceptionFinale();
        SomeClass.implementTryFinaleInTryCatch();
    }
}
