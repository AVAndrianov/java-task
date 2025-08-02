package ru.task.java.chapter6.task20;

import ru.task.java.chapter6.task17.Employee;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnArray {

    //Реализуйте следующий метод:
    //0SafeVarargs public static final <T> T[] repeat(int n, T... objs)
    //Он должен возвращать массив n копий заданных объектов. Имейте в виду, что
    //для этого не потребуется объект типа C la ss или ссылка на конструктор, поскольку
    //наращивать количество объектов obj s можно рефлексивно.

    @SafeVarargs
    public static final <T> T[] repeat(int n, T... objs) {
        Class<?> originClass = objs.getClass().getComponentType();
        T[] arr = (T[]) Array.newInstance(originClass, 10);
        Arrays.fill(arr, objs);
        return arr;
    }

    public static void main(String[] args) {
        ReturnArray.repeat(10, new Employee(), new Employee());
    }
}
