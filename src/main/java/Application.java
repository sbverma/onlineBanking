import java.util.Scanner;

public class Application {

  public static Customer customerLogin() {
    boolean loggedIn = false;
    while (!loggedIn) {
      System.out.println("Hi Customer!");
      System.out.println("Kindly enter your PAN number: ");

      Scanner scanner = new Scanner(System.in);
      String customerPanNo = scanner.nextLine();

      Optional<Customer> customer = Customer.findCustomerByPanNo(customerPanNo);
      if (customer.isPresent()) {
        return customer.get();
      } else {
        System.out.println("No customer found for PAN no.: " + customerPanNo);
      }
    }
  }

  public static void main(String[] args) {

    Customer customer = customerLogin();
    Action selectedAction = null;
    do {
      try {
        renderActionsMenu();
        selectedAction = takeActionFromCustomer();

        Bundle bundle = new Bundle();
        bundle.put("customer", customer);

        selectedAction.getActionHandler().handleAction(bundle);
      } catch (Exception e) {
        // TODO: SHIVAM: ADD LOG HERE USING A LOGUTIL
      }

    } while (selectedAction != Action.EXIT);

  }

}