package be.isims.ihm.tp3.ex1;

public class BinaryObserver implements Observer {

    @Override
    public void update(Object o) {
        System.out.println("Binary number: " + Integer.toBinaryString(((Input)o).getNumber()));
    }
}