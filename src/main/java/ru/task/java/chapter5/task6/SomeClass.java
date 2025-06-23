package ru.task.java.chapter5.task6;

import ru.task.java.chapter5.task1.FloatPointNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public final class SomeClass {

    public static void someMethod() {

        try (BufferedReader in = Files.newBufferedReader(FloatPointNumber.getDirectories("listDoubleNumber.txt").toPath(), StandardCharsets.UTF_8)) {
            in.lines().forEach(System.out::println);
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SomeClass.someMethod();
    }
}
