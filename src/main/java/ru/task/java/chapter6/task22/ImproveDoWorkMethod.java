package ru.task.java.chapter6.task22;

import java.util.concurrent.Callable;

public class ImproveDoWorkMethod {
    public static <V, T extends Throwable> V doWork(Callable<V> c, Class<T> ex) throws T {
        try {
            return c.call();
        } catch (Throwable realEx) {
            try {
                throw ex.getDeclaredConstructor(String.class).newInstance("Error");
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Exception", e);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String result = doWork(() -> "Work done!", Exception.class);
        System.out.println(result);
    }
}
