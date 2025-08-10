package ru.task.java.chapter4.dop.proxy;

public class BankSecurityProxy implements Bank {

    private Bank bank;

    public BankSecurityProxy(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void setUserMoney(User user, double money) {
        if (!SecurityManager.authorize(user, BankAccounts.Manager)) {
            throw new SecurityException("User can't change money value");
        }
        bank.setUserMoney(user, money);

    }

    @Override
    public int getUserMoney(User user) {
        if (!SecurityManager.authorize(user, BankAccounts.Manager)) {
            throw new SecurityException("User can't get money value");
        }
        return bank.getUserMoney(user);

    }

    public static void main(String[] args) {
        User user = new User();
        Bank bank = new CitiBank();

        bank = new BankSecurityProxy(bank);

        bank.setUserMoney(user, 6876);
    }
}
