package ru.task.java.chapter6.task21;

import java.util.ArrayList;
import java.util.List;

public class MethodForConstructingArrays {

    //Используя аннотацию @SafeV arargs, напишите метод, позволяющий строить
    //массивы обобщенных типов, как в следующем примере:
    //Lists.swapHelper(result, 0, 1);
    //}
    //List<String>[ ] result = Arrays.<List<String»construct (10) ;
    //Устанавливает результат в списке типа List<String>[] длиной 10
    public static void main(String[] args) {

    }

    public void metod() {
        List<String>[] result = Arrays.construct(10);

        for (int i = 0; i < result.length; i++) {
            result[i] = new ArrayList<>();
        }

        result[0].add("Hello");
        result[1].add("World");
    }

    public static class Arrays {
        public static <T> T[] construct(int size) {
            @SuppressWarnings("unchecked")
            T[] arr = (T[]) new Object[size];
            return arr;
        }
    }
}
