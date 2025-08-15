package ru.task.java.chapter7.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public final class RearrangementOfElements {

    private RearrangementOfElements() {
        throw new UnsupportedOperationException();
    }

    public static List<?> swap(List<?> list, int i, int j) {
        Object tempI = null;
        Object tempJ = null;
        List<Object> listO;
        if (list instanceof RandomAccess) {
            listO = new ArrayList<>(list);
            tempI = listO.get(i);
            tempJ = listO.get(j);
        } else {
            listO = new LinkedList<>(list);
            Iterator<Object> iterator = listO.iterator();
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
        listO.set(i, tempJ);
        listO.set(j, tempI);
        return listO;
    }
}

