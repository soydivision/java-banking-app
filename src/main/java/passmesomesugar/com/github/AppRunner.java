package passmesomesugar.com.github;

/**
 * Hello world!
 */
public class AppRunner {
    public static void main(String[] args) {
        BankingAppMenu bankingAppMenu = new BankingAppMenu();
        CustomerBusinessObject customerBusinessObject = new CustomerBusinessObject();
        bankingAppMenu.initializeMenu(customerBusinessObject.customers.get(1));
    }
}
