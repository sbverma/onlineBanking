package entities;

public class SavingAccount extends Account {

    private String accountType;
    private Double minimumBalance;

    public SavingAccount() {
        super();
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
        return "SavingAccount{" +
                "accountType='" + accountType + '\'' +
                ", minimumBalance=" + minimumBalance +
                '}';
    }
}
