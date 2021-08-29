package passmesomesugar.com.github.funds;

import passmesomesugar.com.github.BankingAccountOperations;
import passmesomesugar.com.github.Cashback;
import passmesomesugar.com.github.CurrencyConvertion;
import passmesomesugar.com.github.Currency;

import java.util.Hashtable;

public class Card implements BankingAccountOperations, CurrencyConvertion, Cashback {
    Hashtable<Currency, Integer> currencies;
    static int allCardsCounter;

    public Card(Hashtable<Currency, Integer> currencies) {
        this.currencies = currencies;
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

    @Override
    public void cashBack() {
    }
}
