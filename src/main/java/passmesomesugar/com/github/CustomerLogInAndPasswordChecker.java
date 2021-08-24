package passmesomesugar.com.github;

public class CustomerLogInAndPasswordChecker {
    CustomerPlainData customerPlainData = new CustomerPlainData();

    public boolean checkIfUserExists(String logInUserName) {
        return customerPlainData.checkIfCustomerExists(logInUserName);
    }

    public void verifyUser(String logInUserName, String password) {
        Customer userToBeVerified =
                customerPlainData.getCustomerByLogInNameOrEmail(logInUserName);
        if (userToBeVerified.getPassword().compareTo(password) == 0) {
            System.out.println("User exists and password is correct");
            new BankingAppMenu().initializeMenu(userToBeVerified);
        } else {
            System.out.println("Log In has failed");
        }
    }
}
