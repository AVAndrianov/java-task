package ru.task.java.chapter5.task8;

import java.util.concurrent.locks.ReentrantLock;

public final class RentalLock {
    int count = 0;

    public ReentrantLockeWrapper helperRentalLock() {
        try (ReentrantLockeWrapper reentrantLockeWrapper = new ReentrantLockeWrapper(new ReentrantLock())) {
            reentrantLockeWrapper.getLock().lock();
            count++;
            return reentrantLockeWrapper;
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
            private final RentalLock rentalLock = new RentalLock();

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
            private final RentalLock rentalLock = new RentalLock();

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
