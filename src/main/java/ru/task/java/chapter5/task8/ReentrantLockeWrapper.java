package ru.task.java.chapter5.task8;

import java.util.concurrent.locks.Lock;

public class ReentrantLockeWrapper implements AutoCloseable {
    private Lock lock;

    public ReentrantLockeWrapper(Lock lock) {
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
