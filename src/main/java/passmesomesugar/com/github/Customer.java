package passmesomesugar.com.github;

public class Customer {
    private String name;
    private String id;
    private int deposit;

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
}

