package ru.task.java.chapter7.task5;

import java.util.List;
import java.util.RandomAccess;

public class RearrangementOfElements implements RandomAccess {

    public void swap(List<?> list, int i, int j) {
        List<Object> listO = (List<Object>) list;
        var tempI = listO.get(i);
        var tempJ = listO.get(j);
        listO.set(i, tempJ);
        listO.set(j, tempI);
        listO.forEach(System.out::println);
    }
}
