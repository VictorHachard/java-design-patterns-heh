package be.isims.ihm.tp4.ex2;

public class SavingsAccount extends Account {

    public String toString() {
        double sum = super.getBalance().stream().mapToDouble(a -> a).sum();
        return "SavingsAccount: " + sum + " LastOperation: " + super.getBalance().get(super.getBalance().size() -1).toString();
    }

}
