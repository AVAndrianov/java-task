package ru.task.java.chapter6.task14;

import java.util.Collection;

public class ImprovedVersionCloseAllMethod {

    public static void closeAll(Collection<? extends AutoCloseable> resources) throws Exception {
        Exception primaryException = null;
        for (AutoCloseable resource : resources) {
            try {
                if (resource != null) {
                    resource.close();
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

