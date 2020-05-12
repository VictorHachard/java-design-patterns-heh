package be.isims.ihm.tp4.ex1;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private List<Double> balance;
    private BankAccountFrm bankAccountFrm;

    public BankAccount() {
        this.balance = new ArrayList<>();
        this.balance.add(0.0);
        bankAccountFrm = new BankAccountFrm(this);
    }

    public BankAccount(double balance) {
        this.balance = new ArrayList<>();
        if (balance > 0)
            this.balance.add(balance);
        else
            this.balance.add(0.0);
        bankAccountFrm = new BankAccountFrm(this);
    }

    public void addDepot(double depot) {
        double last = balance.get(balance.size() -1);
        this.balance.add(last + depot);
    }

    public double getLastBalance() {
        return this.balance.get(balance.size() -1);
    }

    public BankAccountFrm getBankAccountFrm() {
        return this.bankAccountFrm;
    }

}
