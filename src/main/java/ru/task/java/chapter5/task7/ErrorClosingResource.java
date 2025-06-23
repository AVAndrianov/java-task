package ru.task.java.chapter5.task7;

import java.util.Scanner;

public final class ErrorClosingResource {

    public static void main(String[] args) {
        // Исключение возникшее в блоке try будет отложено до выполнения блока finally
        try (Scanner sc = new Scanner(System.in)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.err.println("Подавленное исключение: " + suppressed.getMessage());
            }
        }
    }
}
