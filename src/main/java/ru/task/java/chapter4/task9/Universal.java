package ru.task.java.chapter4.task9;

import java.util.Arrays;

public class Universal {

    int aInt = 0;
    String bString = null;

    /**
     * Метод возвращает список всех полей класса
     */
    @Override
    public String toString() {
        return Arrays.toString(
                Arrays.stream(
                                this.getClass().getDeclaredFields())
                        .map(i -> i.getName() + " " + i.getType())
                        .toArray()
        );
    }

    public static void main(String[] args) throws IllegalAccessException {
        /**
         * Запрос на получение списка всех полей класса
         */
        System.out.println(new Universal());
    }
}
