package ru.task.java.chapter5.task8;

import java.util.concurrent.locks.Lock;

public class ReentrantLockWrapper implements AutoCloseable {

    private Lock lock;

    public ReentrantLockWrapper(Lock lock) {
        this.lock = lock;
    }

    public Lock getLock() {
        return lock;
    }

    @Override
    public void close() {
        lock.unlock();
    }
}
