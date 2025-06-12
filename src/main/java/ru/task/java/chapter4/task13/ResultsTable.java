package ru.task.java.chapter4.task13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

public class ResultsTable {

    public static void getResultsTable(Method m, int min, int max, int step) throws InvocationTargetException, IllegalAccessException {
        /**
         * Зачем тут obj, ведь он null
         */
        Object obj = null;
        for (int i = min; i < max; i = i + step) {
            System.out.println(m.getName() + " " + i + " " + m.invoke(null, i));
        }
    }

    /**
     * Имя передаваемого метода отсутсвует
     *
     * @param m
     * @param min
     * @param max
     * @param step
     */
    public static void getResultsTable(DoubleFunction<Object> m, int min, int max, int step) {
        for (int i = min; i < max; i = i + step) {
            System.out.println(i + " " + m.apply(i));
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ResultsTable.getResultsTable(Math.class.getMethod("sqrt", double.class), 10, 40, 3);
        ResultsTable.getResultsTable(Double.class.getMethod("toHexString", double.class), 10, 40, 3);

        ResultsTable.getResultsTable(Math::sqrt, 10, 40, 3);
        ResultsTable.getResultsTable(Double::toHexString, 10, 40, 3);

    }
}
