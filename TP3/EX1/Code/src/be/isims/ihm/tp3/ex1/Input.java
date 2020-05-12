package be.isims.ihm.tp3.ex1;

public class Input extends Observable {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        super.notifyAllObservers();
    }
}
