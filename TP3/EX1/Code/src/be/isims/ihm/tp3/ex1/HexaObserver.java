package be.isims.ihm.tp3.ex1;

public class HexaObserver implements Observer {

    @Override
    public void update(Object o) {
        System.out.println("Hexa number: " + Integer.toHexString(((Input)o).getNumber()).toUpperCase());
    }
}