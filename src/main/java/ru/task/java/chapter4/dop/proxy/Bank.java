package ru.task.java.chapter4.dop.proxy;

public interface Bank {

    void setUserMoney(User user, double money);

    int getUserMoney(User user);
}
