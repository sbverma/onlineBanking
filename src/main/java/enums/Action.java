package enums;

public enum Action {

  CREATE_BANK_ACCOUNT(ActionHandlers::createBankAccountHandler),
  WITHDRAW_MONEY_FROM_ACCOUNT(AccountHandlers::withdrawMoneyFromAccountHandler),
  DEPOSIT_MONEY_INTO_ACCOUNT(AccountHandlers::depositMoneyIntoAccountHandler),
  VIEW_PASSBOOK(AccountHandlers::viewPassbookHandler),
  EXIT(AccountHandler::exitHandler);

  private ActionHandlerLambda actionHandler;

  public ActionHandlerLambda getActionHandler() {
    return actionHandler;
  }

}