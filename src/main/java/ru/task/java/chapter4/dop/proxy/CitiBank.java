package ru.task.java.chapter4.dop.proxy;

public class CitiBank implements Bank {

    Double money;

    @Override
    public void setUserMoney(User user, double money) {
        this.money = money;
        System.out.println(user.getClass().getCanonicalName() + money);
    }

    @Override
    public int getUserMoney(User user) {
        return 0;
    }
}
