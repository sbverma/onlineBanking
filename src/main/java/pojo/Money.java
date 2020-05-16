

public class Money {
  private Integer amount;
  private Currency currency;

  Money(Integer amount) {
    this.amount = amount;
    this.currency = Currency.INR;
  }
}