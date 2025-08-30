package ru.task.java.chapter4.dop.proxy;

public class CitiBalanceService implements BalanceService {

    private Double money;

    @Override
    public void setBalance(User user, double money) {
        this.money = money;
        System.out.println(user.getClass().getCanonicalName() + money);
    }

    @Override
    public Double getBalance(User user) {
        return 0.0;
    }
}
