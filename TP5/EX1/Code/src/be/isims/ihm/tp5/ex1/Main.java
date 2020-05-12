package be.isims.ihm.tp5.ex1;

public class Main {

    public static void main(String[] args) {
        Pizza hamDecorator = new HamDecorator(new MeatBallsDecorator(new Fine()));

        System.out.println(hamDecorator.toString() + "Price: " + Double.toString(hamDecorator.price()));
    }
}
