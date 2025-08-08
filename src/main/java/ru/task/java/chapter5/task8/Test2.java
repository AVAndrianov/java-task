package ru.task.java.chapter5.task8;

import java.util.concurrent.locks.ReentrantLock;

public final class Test2 {
    int count = 0;

    public ReentrantLockWrapper helperRentalLock() {
        try (ReentrantLockWrapper reentrantLockWrapper = new ReentrantLockWrapper(new ReentrantLock())) {
            reentrantLockWrapper.getLock().lock();
            count++;
            return reentrantLockWrapper;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            private final Test2 rentalLock = new Test2();

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    rentalLock.helperRentalLock();
                    System.out.println("Thread1");
                    System.out.println(rentalLock.getCount());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            private final Test2 rentalLock = new Test2();

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    rentalLock.helperRentalLock();
                    System.out.println("Thread2");
                    System.out.println(rentalLock.getCount());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };
        new Thread(runnable).start();
        new Thread(runnable2).start();
    }
}
