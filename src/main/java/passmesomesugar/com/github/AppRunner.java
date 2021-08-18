package passmesomesugar.com.github;

/**
 * Hello world!
 */
public class AppRunner {
    public static void main(String[] args) {
        BankingAppMenu bankingAppMenu = new BankingAppMenu();
        CustomerBusinessObject customerBusinessObject = new CustomerBusinessObject();
        System.out.println(customerBusinessObject.customers.get(1).equals(customerBusinessObject.customers.get(2)));
        bankingAppMenu.initializeMenu(customerBusinessObject.customers.get(1));
    }
}
