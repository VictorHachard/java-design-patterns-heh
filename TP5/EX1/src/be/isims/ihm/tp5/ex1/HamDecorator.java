package be.isims.ihm.tp5.ex1;

public class HamDecorator extends PizzaDecorator {

    private double price = 8.0;

    public HamDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double price() {
        return super.price() + price;
    }

    @Override
    public String toString() {
        return super.toString() + "PizzaDecorator: Ham\n";
    }

}
