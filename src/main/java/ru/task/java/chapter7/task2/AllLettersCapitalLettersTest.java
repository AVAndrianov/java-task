package ru.task.java.chapter7.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllLettersCapitalLettersTest {
    private String[] array;
    private List<String> expect;

    @BeforeEach
    void setUp() {
        array = new String[]{"SfSfS", "JhGfDG", "JGhdJG"};
    }

    @Test
    void iteratorTest() {
        expect = AllLettersCapitalLetters.iterator(array);

        assertEquals(expect.toString(), Arrays.toString(array).toLowerCase(Locale.ROOT));
        assertEquals(expect.size(), array.length);
    }

    @Test
    void indexTest() {
        expect = AllLettersCapitalLetters.index(array);

        assertEquals(expect.toString(), Arrays.toString(array).toLowerCase(Locale.ROOT));
        assertEquals(expect.size(), array.length);
    }

    @Test
    void replaceTest() {
        expect = AllLettersCapitalLetters.replace(array);

        assertEquals(expect.toString(), Arrays.toString(array).toLowerCase(Locale.ROOT));
        assertEquals(expect.size(), array.length);
    }
}
