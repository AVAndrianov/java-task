package ru.task.java.chapter7.task2;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AllLettersCapitalLettersTest {

    @Test
    public void iteratorTest() {
        String[] mess = new String[]{"SfSfS", "JhGfDG", "JGhdJG"};

        List<String> list = AllLettersCapitalLetters.iterator(mess);

        assertEquals(list.get(0), mess[0].toLowerCase(Locale.ROOT));
        assertEquals(list.size(), mess.length);
        assertNotEquals(list.get(0), mess[0]);
    }

    @Test
    public void indexTest() {
        String[] mess = new String[]{"SfSfS", "JhGfDG", "JGhdJG"};

        List<String> list = AllLettersCapitalLetters.index(mess);

        assertEquals(list.get(0), mess[0].toLowerCase(Locale.ROOT));
        assertEquals(list.size(), mess.length);
        assertNotEquals(list.get(0), mess[0]);
    }

    @Test
    public void replaceTest() {
        String[] mess = new String[]{"SfSfS", "JhGfDG", "JGhdJG"};

        List<String> list = AllLettersCapitalLetters.replace(mess);

        assertEquals(list.get(0), mess[0].toLowerCase(Locale.ROOT));
        assertEquals(list.size(), mess.length);
        assertNotEquals(list.get(0), mess[0]);
    }
}
