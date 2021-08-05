package passmesomesugar.com.github;

public class Customer {
    private String name;
    private String id;
    private int deposit;
    private String password;
    private String logInName;

    public Customer(String name, String id, int deposit) {
        this.name = name;
        this.id = id;
        this.deposit = deposit;
    }

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public int showFunds() {
        return this.deposit;
    }

    public void deposit(int amount) {
        deposit += amount;
    }

    public void withdraw(int amount) {
        deposit -= amount;
    }
}

