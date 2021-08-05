package passmesomesugar.com.github;

import java.util.Scanner;

public class BankingAppMenu {
    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        do {
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            switch (option) {
                case 'A':
                    System.out.println("Deposit funds");
                    break;
                case 'S':
                    System.out.println("Withdraw funds");
                    break;
                case 'D':
                    System.out.println("");
                    break;
                case 'F':
                    System.out.println("");
                    break;
            }
        }
        while (option != 'Q');
        System.out.println("K thx bye");
    }
}
