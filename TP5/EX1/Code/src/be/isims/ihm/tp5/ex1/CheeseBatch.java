package be.isims.ihm.tp5.ex1;

public class CheeseBatch implements Pizza {

    private double price = 12.0;

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza: CheeseBatch\n";
    }

}
