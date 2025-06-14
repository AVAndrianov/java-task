package ru.task.java.chapter4.task9;

import java.util.Arrays;

public class GenericReflectionMethodToString {

    private final int aInt = 0;
    private final String bString = null;

    /**
     * Метод возвращает список всех полей класса
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + Arrays.toString(
                Arrays.stream(this.getClass().getDeclaredFields())
                        .map(i -> {
                                    try {
                                        return i.getName() + "=" + i.get(this);
                                    } catch (IllegalAccessException e) {
                                        return new IllegalAccessException();
                                    }
                                }
                        )
                        .toArray()
        );
    }

    public static void main(String[] args) throws IllegalAccessException {
        //Запрос на получение списка всех полей класса
        System.out.println(new GenericReflectionMethodToString());
    }
}
