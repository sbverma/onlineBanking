package validators;

import entities.Account;
import pojo.Money;
import utils.DateUtil;

import java.time.LocalDateTime;

public class DailyWithdrawalLimitValidator implements Validator {
    public boolean validate(Account account, Money withrawalMoney) {
        if(!DateUtil.getDateAsString(LocalDateTime.now()).equals(account.getDailyWithdrawalLimit().getDate()))  {
            return false;
        }
        if (account.getDailyWithdrawalLimit().getAmountDebit().getAmount() + withrawalMoney.getAmount() <= account.getMinimumBalance().getAmount() ) {
            return true;
        }
        return false;
    }
}
