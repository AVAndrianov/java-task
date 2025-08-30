package ru.task.java.chapter4.dop.proxy;

public class BalanceServiceSecurityProxy implements BalanceService {

    private BalanceService balanceService;

    public BalanceServiceSecurityProxy(BalanceService balanceService) {
        this.balanceService = balanceService;
    }

    @Override
    public void setBalance(User user, double money) {
        if (SecurityManager.authorize(user, BankAccountRole.Manager)) {
            throw new SecurityException("User can't change money value");
        }
        balanceService.setBalance(user, money);
    }

    @Override
    public Double getBalance(User user) {
        if (SecurityManager.authorize(user, BankAccountRole.Manager)) {
            throw new SecurityException("User can't get money value");
        }
        return balanceService.getBalance(user);
    }

    public static void main(String[] args) {
        User user = new User();
        BalanceService balanceService = new CitiBalanceService();
        balanceService = new BalanceServiceSecurityProxy(balanceService);
        balanceService.setBalance(user, 6876);
    }
}
