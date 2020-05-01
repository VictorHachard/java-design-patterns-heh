package be.isims.ihm.tp4.ex2;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super.name = getClass().getSimpleName();
    }

    public boolean update() {
        super.getBalance().add(balance.stream().mapToDouble(a -> a).sum() * 0.05);
        return true;
    }

}
