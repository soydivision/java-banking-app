package passmesomesugar.com.github;

public class CustomerLogInAndPasswordChecker {
    CustomerPlainData customerBusinessObject = new CustomerPlainData();

    public void verifyUser(String logInUserName, String password) {
        Customer userToBeVerified =
                customerBusinessObject.getCustomerByLogInNameOrEmail(logInUserName);
        if (userToBeVerified.getPassword().compareTo(password) == 0) {
            System.out.println("User exists and password is correct");
            new BankingAppMenu().initializeMenu(userToBeVerified);
        } else {
            System.out.println("Log In has failed");
        }
    }
}
