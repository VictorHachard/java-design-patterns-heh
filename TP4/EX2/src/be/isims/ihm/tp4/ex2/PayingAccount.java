package be.isims.ihm.tp4.ex2;

public class PayingAccount extends Account {

    public PayingAccount() {
        super.name = getClass().getSimpleName();
    }

    public void add(double i) {
        super.balance.add(i - i*0.05);
    }

    public void get(double i) {
        super.balance.add(- (i + i*0.05));
    }

}
