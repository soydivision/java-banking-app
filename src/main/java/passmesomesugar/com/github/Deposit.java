package passmesomesugar.com.github;

public class Deposit implements BankingAccountOperations {
    int deposit;

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public void showFunds() {
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
