package passmesomesugar.com.github;

public class Deposit implements BankingAccountOperations {
    private int deposit;

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public void showFunds() {
        System.out.println(deposit);
    }

    @Override
    public void transfer() {
    }

    @Override
    public void deposit() {
    }

    @Override
    public void withdraw() {
    }

    @Override
    public void convert() {
    }

    @Override
    public void pay() {
    }
}
