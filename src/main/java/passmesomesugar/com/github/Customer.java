package passmesomesugar.com.github;

public class Customer {
    private String name;
    private int id;
    private int deposit;
    private String password;
    private String logInNameOrEmail;
    private String email;

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
    public Customer(String name, String logInNameOrEmail, String password, int id, int deposit) {
        this.name = name;
        this.logInNameOrEmail = logInNameOrEmail;
        this.password = password;
        this.id = id;
        this.deposit = deposit;
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

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int showFunds() {
        return this.deposit;
    }

    public void deposit(int amount) {
        // this simply means we increase the value deposit by amount.
        deposit += amount;
    }

    public void withdraw(int amount) {
        // this simply means we decrease the value deposit by amount.
        deposit -= amount;
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
}

