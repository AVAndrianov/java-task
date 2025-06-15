package ru.task.java.chapter5.task5;

import ru.task.java.chapter5.task1.FloatPointNumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public final class ExceptionHandlingScannerPrintWrite {

    public static void print() throws FileNotFoundException {
        Scanner in = null;
        PrintWriter out = null;
        try {
            in = new Scanner(new File(String.valueOf(FloatPointNumber.getDirectories("listDoubleNumber.txt"))));
            out = new PrintWriter(String.valueOf(FloatPointNumber.getDirectories("output.txt")));
            while (in.hasNext()) {
                out.println(in.next().toLowerCase(Locale.ROOT));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalStateException | NoSuchElementException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
