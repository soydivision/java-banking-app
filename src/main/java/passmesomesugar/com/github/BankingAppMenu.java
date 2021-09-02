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
                    int amountToDeposit = scanner.nextInt();
                    customer.getDeposit().deposit(amountToDeposit);
                    break;
                case 'S':
                    if (customer.hasCard()) {
                        customer.getCard().showFunds();
                    } else {
                        System.out.println("No card found");
                    }
                    break;
                case 'D':
                    int withdrawalAmount = scanner.nextInt();
                    customer.getDeposit().withdraw(withdrawalAmount);
                    break;
                case 'F':
                    if (customer.hasDeposit()) {
                        customer.getDeposit().showFunds();
                    } else {
                        System.out.println("No deposit found");
                    }
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
