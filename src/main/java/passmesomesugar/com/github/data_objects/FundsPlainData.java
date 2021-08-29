package passmesomesugar.com.github.data_objects;

import passmesomesugar.com.github.Currency;
import passmesomesugar.com.github.cards.Visa;
import passmesomesugar.com.github.funds.Card;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class FundsPlainData {
    Hashtable<Currency, Integer> cardsTable = new Hashtable<>();
    Card visa1 = new Visa(cardsTable);

    public FundsPlainData() {
    }

    public List getCards() {
        cardsTable.put(passmesomesugar.com.github.Currency.USD, 23);
        List list = new ArrayList();
        list.add(cardsTable);
        return list;
    }
}
