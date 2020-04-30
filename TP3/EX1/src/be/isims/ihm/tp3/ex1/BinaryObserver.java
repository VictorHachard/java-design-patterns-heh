package be.isims.ihm.tp3.ex1;

public class BinaryObserver extends Observer {

    @Override
    public void update(Object o) {
        System.out.println("Binary number: " + Integer.toBinaryString(((Input)o).getNumber()));
    }
}