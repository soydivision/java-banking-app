package passmesomesugar.com.github;

import passmesomesugar.com.github.funds.Card;
import passmesomesugar.com.github.funds.Deposit;

public class Customer {
    private String name;
    private int id;
    private Deposit deposit = new Deposit();
    private String password;
    private String logInNameOrEmail;
    private String email;
    private Card card;

    public boolean hasDeposit() {
        return deposit != null;
    }

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

    public Customer() {
    }

    public Customer(String name, String logInNameOrEmail, String password, int id, Deposit deposit) {
        this.name = name;
        this.logInNameOrEmail = logInNameOrEmail;
        this.password = password;
        this.id = id;
        this.deposit = deposit;
    }

    public Customer(String name, String logInNameOrEmail, String password, int id) {
        this.name = name;
        this.logInNameOrEmail = logInNameOrEmail;
        this.password = password;
        this.id = id;
    }

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

    public Deposit getDeposit() {
        return deposit;
    }

    public Card getCard() {
        return this.card;
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

