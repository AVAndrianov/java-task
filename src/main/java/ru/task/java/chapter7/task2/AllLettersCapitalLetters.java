package ru.task.java.chapter7.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public final class AllLettersCapitalLetters {

    private AllLettersCapitalLetters() {
        throw new UnsupportedOperationException();
    }

    public static List<String> iterator(String[] mess) {
        List<String> list = new ArrayList<>(Arrays.asList(mess));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            iterator.set(current.toLowerCase());
        }
        return list;
    }

    public static List<String> index(String[] mess) {
        List<String> list = new ArrayList<>(Arrays.asList(mess));
        for (int i = 0; i < mess.length; i++) {
            list.set(i, list.get(i).toLowerCase(Locale.ROOT));
        }
        return list;
    }

    public static List<String> replace(String[] mess) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(mess));
        list.replaceAll(String::toLowerCase);
        return list;
    }
}
