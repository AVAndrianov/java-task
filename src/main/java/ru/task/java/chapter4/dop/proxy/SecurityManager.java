package ru.task.java.chapter4.dop.proxy;

public class SecurityManager {

    public static boolean authorize(User user, BankAccounts bankAccounts) {
        return bankAccounts.equals(BankAccounts.Manager);
    }
}
