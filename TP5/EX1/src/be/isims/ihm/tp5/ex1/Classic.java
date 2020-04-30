package be.isims.ihm.tp5.ex1;

public class Classic implements Pizza {

    private double price = 8.0;

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza: Classic\n";
    }

}
