package ru.task.java.chapter4.dop.proxy;

public class SecurityManager {

    public static boolean authorize(User user, BankAccountRole bankAccountRole) {
        return !bankAccountRole.equals(BankAccountRole.Manager);
    }
}
