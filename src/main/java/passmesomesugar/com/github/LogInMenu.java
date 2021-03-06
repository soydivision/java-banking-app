package passmesomesugar.com.github;

import java.util.Scanner;

public class LogInMenu {
    Scanner scanner = new Scanner(System.in);
    CustomerLogInAndPasswordChecker logInChecker = new CustomerLogInAndPasswordChecker();

    public void initializeMenu() {
        System.out.println("Please enter your username or email");
        String usernameOrEmailInput = promptUsernameOrEmail();
        if (logInChecker.checkIfUserExists(usernameOrEmailInput)) {
            System.out.println("Please enter password");
            String passwordInput = promptPassword();
            logInChecker.verifyUser(usernameOrEmailInput, passwordInput);
        } else {
            System.out.println("Customer does not exist");
        }
    }

    public String promptUsernameOrEmail() {
        return scanner.nextLine();
    }

    public String promptPassword() {
        return scanner.nextLine();
    }
}
