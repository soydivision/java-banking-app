package passmesomesugar.com.github;

import java.util.Scanner;

public class BankingAppMenu {
    Customer customer;

    public void showMenu(Customer customer) {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("A.Deposit funds");
        System.out.println("S.Show funds");
        System.out.println("D.Withdraw funds");
        System.out.println("F.");// Soon to be implemented
        do {
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            switch (option) {
                case 'A':
                    int amountToDeposit = scanner.nextInt();
                    customer.deposit(amountToDeposit);
                    break;
                case 'S':
                    System.out.println(customer.showFunds());
                    break;
                case 'D':
                    System.out.println("");
                    break;
                case 'F':
                    System.out.println("");
                    break;
            }
        }
        while (option != 'G');
        System.out.println("Thank you for using our service.");
    }
}
