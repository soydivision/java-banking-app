package passmesomesugar.com.github.cards;

import passmesomesugar.com.github.Currency;
import passmesomesugar.com.github.funds.Card;


import java.util.Hashtable;

/* Is not related to MasterCard */
public class MasterCard extends Card {
    public MasterCard(Hashtable<Currency, Integer> currencies) {
        super(currencies);
    }
}
