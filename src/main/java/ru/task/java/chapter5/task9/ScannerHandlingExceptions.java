package ru.task.java.chapter5.task9;

import ru.task.java.chapter5.task1.FileReaderCustom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerHandlingExceptions {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNext()) {
                System.out.println(sc.next());
            } else {
                System.out.println("Ошибка");
            }
        } catch (InputMismatchException e) {
            System.out.println("Не корректный тип данных.");
        } catch (NoSuchElementException e) {
            System.out.println("Данные не найдены");
        }

        try (Scanner scanner = new Scanner(new File(String.valueOf(FileReaderCustom.getDirectories("data.txt"))))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
