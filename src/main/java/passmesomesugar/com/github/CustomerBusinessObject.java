package passmesomesugar.com.github;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerBusinessObject {
    List<Customer> customers;

    public CustomerBusinessObject() {
        customers = new ArrayList<Customer>(Arrays.asList(new Customer("John Dale", "JohnDale", "batman", 1),
                new Customer("Michael Jordan", "Jordan78", "pass", 2, 5000),
                new Customer("Michael Jordanos", "MikeTison210", "123", 3, 5000)));
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
}
