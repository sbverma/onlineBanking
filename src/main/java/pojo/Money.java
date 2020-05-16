package pojo;

public class Money {
  private Double amount;
  private Currency currency;

  Money(Double amount) {
    this.amount = amount;
    this.currency = Currency.INR;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  @Override
  public String toString() {
    return "Money{" +
            "amount=" + amount +
            ", currency=" + currency +
            '}';
  }
}