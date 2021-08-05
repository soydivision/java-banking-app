package passmesomesugar.com.github;

import java.io.IOException;

public class BankingAppMenu {
    public void showMenu() {
        char option = ' ';
        try {
            option = (char) System.in.read();
        } catch (IOException e) {
            System.out.println("IOException error took place");
        }
        do {
            switch (option) {
                case 'A':
                    System.out.println("Deposist funds");
                case 'S':
                    System.out.println();
                case 'D':
                    System.out.println();
                case 'F':
                    System.out.println("");
            }
        }
        while (option != 'Q');
        System.out.println("K thx bye");
    }
}
