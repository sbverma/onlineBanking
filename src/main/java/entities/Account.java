package entities;

import enums.AccountType;
import pojo.DailyWithdrawalLimit;
import pojo.Money;

public abstract class Account {

    private Long accountId;
    private Money currentBalance;
    private Double interestRate;
    private Customer customer;
    private Money minimumBalance;
    private AccountType accountType;
    private DailyWithdrawalLimit dailyWithdrawalLimit;

    public Account() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Money getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Money currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Money getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(Money minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public DailyWithdrawalLimit getDailyWithdrawalLimit() {
        return dailyWithdrawalLimit;
    }

    public void setDailyWithdrawalLimit(DailyWithdrawalLimit dailyWithdrawalLimit) {
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", currentBalance=" + currentBalance +
                ", interestRate=" + interestRate +
                ", customer=" + customer +
                ", minimumBalance=" + minimumBalance +
                ", accountType=" + accountType +
                ", dailyWithdrawalLimit=" + dailyWithdrawalLimit +
                '}';
    }
}
