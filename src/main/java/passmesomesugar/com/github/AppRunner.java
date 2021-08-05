package passmesomesugar.com.github;

/**
 * Hello world!
 */
public class AppRunner {
    public static void main(String[] args) {
        BankingAppMenu bankingAppMenu = new BankingAppMenu();
        Customer customerOne = new Customer("John Dale", "1");
        Customer customerTwo = new Customer("Michael Jordan", "2", 10000);
        bankingAppMenu.showMenu(customerTwo);
    }
}
