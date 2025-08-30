package ru.task.java.chapter7.task5;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class RearrangementOfElements {

    private RearrangementOfElements() {
        throw new UnsupportedOperationException();
    }

    public static List<?> swap(List<?> list, int i, int j) {
        Object tempI = null;
        Object tempJ = null;
        if (list instanceof RandomAccess) {
            tempI = list.get(i);
            tempJ = list.get(j);
        } else {
            //Тут приводим к типу Object
            Iterator<Object> iterator = (Iterator<Object>) list.iterator();
            int index = 0;
            while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (index == i) {
                    tempI = obj;
                }
                if (index == j) {
                    tempJ = obj;
                }
                index++;
            }
        }
        //Тут приводим к типу Object
        ((List<Object>) list).set(i, tempJ);
        ((List<Object>) list).set(j, tempI);
        return list;
    }
}

