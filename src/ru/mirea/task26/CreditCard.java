package ru.mirea.task26;

public class CreditCard extends Pay {

    public CreditCard () {
        this.payStrategy = new CreditCardPayStrategy();
    }
}
