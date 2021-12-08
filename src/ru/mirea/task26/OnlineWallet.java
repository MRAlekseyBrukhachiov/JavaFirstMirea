package ru.mirea.task26;

public class OnlineWallet extends Pay {

    public OnlineWallet() {
        this.payStrategy = new OnlineWalletPayStrategy();
    }
}
