package validators;

import entities.Account;
import pojo.Money;

public class MinimumAmountValidator implements Validator {
    public boolean validate(Account account, Money withrawalMoney) {
        if (account.getCurrentBalance().getAmount() - withrawalMoney.getAmount() >= account.getMinimumBalance().getAmount() ) {
            return true;
        }
        return false;
    }
}
