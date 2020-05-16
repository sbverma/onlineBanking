package validators;

import entities.Account;
import pojo.Money;

public interface Validator {
    boolean validate(Account account, Money money);
}
