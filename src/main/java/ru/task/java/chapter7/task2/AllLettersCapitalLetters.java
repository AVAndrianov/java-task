package ru.task.java.chapter7.task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public class AllLettersCapitalLetters {

    @Test
    public void iterator() {
        String[] mess = new String[]{"SfSfS", "JhGfDG", "JGhdJG"};
        List<String> list = new ArrayList<>(Arrays.asList(mess));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            iterator.set(current.toLowerCase());
        }
        assert list.get(0).equals(mess[0].toLowerCase(Locale.ROOT));
    }

    @Test
    public void index() {
        String[] mess = new String[]{"SfSfS", "JhGfDG", "JGhdJG"};
        List<String> list = new ArrayList<>(Arrays.asList(mess));
        for (int i = 0; i < mess.length; i++) {
            list.set(i, list.get(i).toLowerCase(Locale.ROOT));
        }
        assert list.get(0).equals(mess[0].toLowerCase(Locale.ROOT));
    }

    @Test
    public void replace() {
        String[] mess = new String[]{"SfSfS", "JhGfDG", "JGhdJG"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(mess));
        list.replaceAll(String::toLowerCase);
        assert list.get(0).equals(mess[0].toLowerCase(Locale.ROOT));
    }
}
