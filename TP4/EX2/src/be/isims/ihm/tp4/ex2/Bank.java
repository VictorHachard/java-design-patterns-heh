package be.isims.ihm.tp4.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void add(Account account) {
        this.accounts.add(account);
    }

    public void add(Account... accounts) {
        this.accounts.addAll(Arrays.asList(accounts));
    }

    public Account get(int i) {
        return this.accounts.get(i);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String[] getNames() {
        String res[] = new String[accounts.size()];
        for (int i = 0; i < accounts.size(); i++) {
            res[i] = accounts.get(i).getName();
        }
        return res;
    }

}
