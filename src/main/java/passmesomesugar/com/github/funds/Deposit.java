package passmesomesugar.com.github.funds;

import passmesomesugar.com.github.BankingAccountOperations;

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
    public void deposit(int amount) {
        deposit += amount;
    }

    @Override
    public void withdraw(int amount) {
        //deposit -= amount;
        if (amount <= this.getDeposit() && amount > 0) {
            int currentDepositValue = this.getDeposit();
            this.setDeposit(currentDepositValue -= amount);
        }
    }

    @Override
    public void pay() {
    }
}
