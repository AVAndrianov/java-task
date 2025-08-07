package ru.task.java.chapter6.task14;

import java.util.ArrayList;

public class ImprovedVersionCloseAllMethod {

    public static <E extends AutoCloseable> void closeAll(ArrayList<E> elems) throws Exception {
        Exception primaryException = null;
        for (E elem : elems) {
            try {
                if (elem != null) {
                    elem.close();
                }
            } catch (Exception e) {
                if (primaryException == null) {
                    primaryException = e;
                } else {
                    primaryException.addSuppressed(e);
                }
            }
        }
        if (primaryException != null) {
            throw primaryException;
        }
    }
}

