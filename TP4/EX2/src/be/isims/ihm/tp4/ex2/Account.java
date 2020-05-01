package be.isims.ihm.tp4.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Account {

    protected List<Double> balance;
    protected String name;

    public Account() {
        this.balance = new ArrayList<>();
        this.balance.add(0.0);
    }

    public void add(double i) {
        this.balance.add(i);
    }

    public void get(double i) {
        this.balance.add(- i);
    }

    public boolean update() {
        return false;
    }

    public List<Double> getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        double sum = balance.stream().mapToDouble(a -> a).sum();
        return "<" + this.name + "> : " + sum + " - LastOperation: " + balance.get(balance.size() -1).toString();
    }
}
