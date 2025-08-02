package ru.task.java.chapter6.task15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ReceivingListArray {


    public static <T, R> Map<T, R> map(List<T> list, Function<T, R> func) {
        Map<T, R> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), func.apply(list.get(i)));
        }
        return map;
    }
}
