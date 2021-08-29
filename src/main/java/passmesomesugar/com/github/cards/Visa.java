package passmesomesugar.com.github.cards;

import passmesomesugar.com.github.Currency;
import passmesomesugar.com.github.funds.Card;

import java.util.Hashtable;

/* Is not related to Visa */
public class Visa extends Card {
    public Visa(Hashtable<Currency, Integer> currencies) {
        super(currencies);
    }
}
