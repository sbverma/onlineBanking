package entities;

public class CurrentAccount extends Account {
    private String accountType;
    private Double minimumBalance;

    public CurrentAccount() {
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(Double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountType='" + accountType + '\'' +
                ", minimumBalance=" + minimumBalance +
                '}';
    }
}
