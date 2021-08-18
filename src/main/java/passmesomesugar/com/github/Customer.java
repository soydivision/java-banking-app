package passmesomesugar.com.github;

public class Customer {
    private String name;
    private String id;
    private int deposit;
    private String password;
    private String logInNameOrEmail;
    private String email;

    // Customer constructor #1
    public Customer(String name, String logInNameOrEmail, String password, String id, int deposit) {
        this.name = name;
        this.logInNameOrEmail = logInNameOrEmail;
        this.password = password;
        this.id = id;
        this.deposit = deposit;
    }

    // Customer constructor #2
    public Customer(String name, String logInNameOrEmail, String password, String id) {
        this.name = name;
        this.logInNameOrEmail = logInNameOrEmail;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer castedObject = (Customer) o;
        if (id.compareTo(castedObject.getId()) == 0) return true;
        else return false;
    }
}

