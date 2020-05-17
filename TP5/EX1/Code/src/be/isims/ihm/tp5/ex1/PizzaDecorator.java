package be.isims.ihm.tp5.ex1;

public abstract class PizzaDecorator implements Pizza {

    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public double price() {
        return decoratedPizza.price();
    }

    @Override
    public String toString() {
        return decoratedPizza.toString();
    }
    
}
