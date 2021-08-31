package passmesomesugar.com.github;

import java.util.Scanner;

public class BankingAppMenu {
    Customer customer;

    public void initializeMenu(Customer customer) {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        showMenu();
        do {
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            switch (option) {
                case 'A':
                    int depositAmount = scanner.nextInt();
                    customer.deposit(depositAmount);
                    break;
                case 'S':
                    customer.showCardFunds();
                    break;
                case 'D':
                    int withdrawalAmount = scanner.nextInt();
                    customer.withdraw(withdrawalAmount);
                    break;
                case 'F':
                    System.out.println("**Some future functionality");
                    break;
                case 'G':
                    System.out.println("You have left the app");
                    break;
                default:
                    System.out.println("Please enter valid option");
                    showMenu();
            }
        }
        while (option != 'G');
        System.out.println("Thank you for using our service.");
    }

    public void showMenu() {
        System.out.println("A. Deposit funds");
        System.out.println("S. Show card funds");
        System.out.println("D. Withdraw funds");
        System.out.println("F. Show deposit funds");// Soon to be implemented
        System.out.println("G.Abort");
    }
}
