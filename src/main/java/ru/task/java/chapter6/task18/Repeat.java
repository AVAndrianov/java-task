package ru.task.java.chapter6.task18;

import java.util.function.IntFunction;

public class Repeat {


//    public static <Т> Т[] repeat(int n, Т obj, IntFunction<T[]> constr){}
    //Рассмотрите следующий метод, представленный в разделе 6.6.3:
    //public static <Т> Т[] repeat(int n, Т obj, IntFunction<T[]> constr)
    //Почему исход вызова A r r a y s . repeat (10, 42, in t [] : :new) окажется неудачным?
    //Как устранить этот недостаток? Что нужно сделать для применения других
    //примитивных типов?


    //Для работы с дженериками для примитивных типо есть обертки

    public static void main(String[] args) {
        Repeat.repeat(12,42, Integer[]::new);
    }

    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] result = constr.apply(n);
        for (int i = 0; i < n; i++) result[i] = obj;
        return result;
    }


}
