package passmesomesugar.com.github;

import java.util.ArrayList;
import java.util.List;

public class CustomerBusinessObject {
    List<Customer> customers;

    public CustomerBusinessObject() {
        customers = new ArrayList<Customer>();
        Customer customerOne = new Customer("John Dale", "JohnDale", "asdfasd", "1");
        Customer customerTwo = new Customer("Michael Jordan", "2", "10000", "2", 5000);
        Customer customerThree = new Customer("Michael Jordanos", "2", "10000", "2", 5000);
        customers.add(customerOne);
        customers.add(customerTwo);
        customers.add(customerThree);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer.getId());
        System.out.println("Customer " + customer.getId() + " has been removed.");
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }
}
