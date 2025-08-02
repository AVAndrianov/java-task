package ru.task.java.chapter6.task22;

import java.util.concurrent.Callable;

public class ImproveDoWorkMethod {
    public static <V, T extends Throwable> V doWork(Callable<V> c, T ex) throws T {
        try {
            return c.call();
        } catch (Throwable realEx) {
            throw ex;
        }
    }

    public static void main(String[] args) throws Exception {
        // Пример использования (требуется экземпляр исключения):
        String result = doWork(() -> "Work done!", new Exception("Something went wrong"));
        System.out.println(result);
    }
}
