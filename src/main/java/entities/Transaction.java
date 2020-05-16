package entities;

import enums.TransactionType;
import pojo.TransactionStatus;

public class Transaction {

    private Long transactionId;
    private Double amount;
    private TransactionType type;
    private TransactionStatus transactionStatus;
    private Account account;

    public Transaction() {
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }



    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}


