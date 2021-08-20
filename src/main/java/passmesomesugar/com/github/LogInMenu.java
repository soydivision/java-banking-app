package passmesomesugar.com.github;

import java.util.Scanner;

public class LogInMenu {
    Scanner scanner = new Scanner(System.in);
    CustomerLogInAndPasswordChecker logInChecker = new CustomerLogInAndPasswordChecker();

    public void initializeMenu() {
        System.out.println("Please enter your username or email");
        String usernameOrEmailInput = promptUsernameOrEmail();
        System.out.println("Please enter password");
        String passwordInput = promptPassword();
        logInChecker.verifyUser(usernameOrEmailInput, passwordInput);
    }

    public String promptUsernameOrEmail() {
        return scanner.nextLine();
    }

    public String promptPassword() {
        return scanner.nextLine();
    }
}
