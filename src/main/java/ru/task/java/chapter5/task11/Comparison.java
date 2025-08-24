package ru.task.java.chapter5.task11;

import ru.task.java.chapter5.task10.RecursiveMethod;

import java.util.Objects;

public final class Comparison {

    public static void main(String[] args) {
        RecursiveMethod obj = new RecursiveMethod();
        // Производится проверка на этапе тестирования, в момент компиляции поле убирается.
        assert obj != null;
        // Проверка на null происходит в рантайме
        Objects.requireNonNull(obj);
    }
}
