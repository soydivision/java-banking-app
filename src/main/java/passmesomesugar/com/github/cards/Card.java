package passmesomesugar.com.github.cards;

import java.util.List;

abstract class Card {
    List<?> currencies;

    public abstract void transact();

    public abstract void deposit();

    public abstract void withdraw();

    public abstract void convert();
}
