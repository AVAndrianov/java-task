package ru.task.java.chapter6.task25;

import java.lang.reflect.Method;
import java.util.Arrays;

public class EnumeratingTypeParameters {
    public static void main(String[] args) throws NoSuchMethodException {
        Method m = String.class.getDeclaredMethod("newStringUTF8NoRepl", byte[].class, int.class, int.class);
        genericDeclaration(m);
    }

    public static String genericDeclaration(Method m) {
        Arrays.stream(m.getTypeParameters()).forEach(System.out::println);
        return "";
    }
}
