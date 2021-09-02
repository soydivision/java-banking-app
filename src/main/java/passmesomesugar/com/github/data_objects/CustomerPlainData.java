package passmesomesugar.com.github.data_objects;

import passmesomesugar.com.github.Customer;
import passmesomesugar.com.github.funds.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerPlainData {
    private List<Customer> customers;
    private FundsPlainData fundsPlainData = new FundsPlainData();

    public Card getCardFromFunds() {
        return fundsPlainData.getCard();
    }

    public CustomerPlainData() {
        customers = new ArrayList<>(Arrays.asList(new Customer("John Dale", "jd", "12", 1),
                new Customer("Michael Jordan", "j78", "pass", 2, fundsPlainData.getDeposit()),
                new Customer("Michael Jordanos", "Mike", "123", 3, fundsPlainData.getDeposit()),
                new Customer("Lol Kekovich", "lol", "12", 4, fundsPlainData.getCard())));
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer.getId());
        System.out.println("Customer " + customer.getId() + " has been removed.");
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomerById(int id) {
        return customers.get(id);
    }

    public Customer getCustomerByLogInNameOrEmail(String logInNameOrEmail) {
        Customer searchResult = new Customer();
        for (Customer customer : customers) {
            if ((customer.getLogInNameOrEmail().compareTo(logInNameOrEmail) == 0)) {
                searchResult = customer;
            }
        }
        return searchResult;
    }

    public boolean checkIfCustomerExists(String logInNameOrEmail) {
        boolean customerExists = false;
        for (Customer customer : customers) {
            if ((customer.getLogInNameOrEmail().compareTo(logInNameOrEmail) == 0)) {
                customerExists = true;
            }
        }
        return customerExists;
    }
}
