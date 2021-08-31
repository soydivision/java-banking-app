package passmesomesugar.com.github;

import passmesomesugar.com.github.funds.Card;

import java.util.Hashtable;
import java.util.List;

public class Customer {
    private String name;
    private int id;
    private Deposit deposit = new Deposit();
    private String password;
    private String logInNameOrEmail;
    private String email;
    private Card card;

    public boolean hasCard() {
        return card != null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogInNameOrEmail() {
        return logInNameOrEmail;
    }

    public void setLogInNameOrEmail(String logInNameOrEmail) {
        this.logInNameOrEmail = logInNameOrEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Customer constructor #1
    public Customer(String name, String logInNameOrEmail, String password, int id, int depositValue) {
        this.name = name;
        this.logInNameOrEmail = logInNameOrEmail;
        this.password = password;
        this.id = id;
        deposit.setDeposit(depositValue);
    }

    // Customer constructor #2
    public Customer(String name, String logInNameOrEmail, String password, int id) {
        this.name = name;
        this.logInNameOrEmail = logInNameOrEmail;
        this.password = password;
        this.id = id;
    }

    // Customer constructor #3
    public Customer() {
    }

    // Customer constructor #4
    public Customer(String name, String logInNameOrEmail, String password, int id, Card card) {
        this.name = name;
        this.logInNameOrEmail = logInNameOrEmail;
        this.password = password;
        this.id = id;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getDeposit() {
        deposit.showFunds();
    }

    public void setDeposit(int depositValue) {
        deposit.setDeposit(depositValue);
    }

    public int showFunds() {
        return this.deposit.getDeposit();
    }

    public void deposit(int amount) {
        // this simply means we increase the value deposit by amount.
        if (amount > 0) {
            int currentDepositValue = deposit.getDeposit();
            deposit.setDeposit(currentDepositValue += amount);
        }
    }

    public void withdraw(int amount) {
        // this simply means we decrease the value deposit by amount.
        if (amount <= deposit.getDeposit() && amount > 0) {
            int currentDepositValue = deposit.getDeposit();
            deposit.setDeposit(currentDepositValue -= amount);
        }
    }

    public void showCardFunds() {
        card.showFunds();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Customer castedObject = (Customer) o;
        return (castedObject.id == this.id);
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", deposit=" + deposit +
                ", password='" + password + '\'' +
                ", logInNameOrEmail='" + logInNameOrEmail + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

