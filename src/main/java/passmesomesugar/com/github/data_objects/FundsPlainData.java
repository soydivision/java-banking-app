package passmesomesugar.com.github.data_objects;

import passmesomesugar.com.github.Currency;
import passmesomesugar.com.github.funds.Card;

import java.util.Hashtable;

public class FundsPlainData {
    Hashtable<Currency, Integer> cardsTable = new Hashtable<>();

    public FundsPlainData() {
    }

    public Card getCard() {
        cardsTable.put(passmesomesugar.com.github.Currency.USD, 23);
        cardsTable.put(passmesomesugar.com.github.Currency.EURO, 48);
        Card visa1 = new Card(cardsTable);
        return visa1;
    }
}
