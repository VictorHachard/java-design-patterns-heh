package be.isims.ihm.tp5.ex1;

public class Fine implements Pizza {

    private double price = 10.0;

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza: Fine\n";
    }

}
