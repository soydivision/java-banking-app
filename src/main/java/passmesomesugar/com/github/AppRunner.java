package passmesomesugar.com.github;

/**
 * Hello world!
 */
public class AppRunner {
    public static void main(String[] args) {
        BankingAppMenu  bankingAppMenu = new BankingAppMenu();
        bankingAppMenu.showMenu();
        Customer customerOne = new Customer("John Dale", "1");
        Customer customerTwo = new Customer("Michael Jordan", "2", 10000);
        System.out.println(customerOne.showFunds());
        System.out.println(customerTwo.showFunds());
    }
}
