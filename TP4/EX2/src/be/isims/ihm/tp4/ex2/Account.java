package be.isims.ihm.tp4.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Account {

    private List<Double> balance;

    public Account() {
        this.balance = new ArrayList<>();
        this.balance.add(0.0);
    }

    public void add(double i) {
        this.balance.add(i);
    }

    public List<Double> getBalance() {
        return balance;
    }
}
