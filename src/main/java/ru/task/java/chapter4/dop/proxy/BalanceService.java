package ru.task.java.chapter4.dop.proxy;

public interface BalanceService {

    void setBalance(User user, double money);

    Double getBalance(User user);
}
