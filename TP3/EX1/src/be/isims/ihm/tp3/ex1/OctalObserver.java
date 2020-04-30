package be.isims.ihm.tp3.ex1;

public class OctalObserver extends Observer {

    @Override
    public void update(Object o) {
        System.out.println("Octal number: " + Integer.toOctalString(((Input)o).getNumber()));
    }
}
