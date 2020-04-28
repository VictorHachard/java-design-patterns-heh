package be.isims.ihm.tp1.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite implements Arborescent {

    private List<Arborescent> child;

    /**
     * Class constructor
     */
    public Composite() {
        this.child = new ArrayList<>();
    }

    @Override
    /**
     * Print all arborescent print methods
     */
    public void printName() {
        child.forEach(Arborescent::printName);
    }

    /**
     * Add this arborescent to the child array
     * @param element A store that implement Arborescent
     */
    public void add(Arborescent element) {
        child.add(element);
    }

    /**
     * Add arborescents to the child array
     * @param elements A store that implement Arborescent
     */
    public void add(Arborescent... elements) {
        child.addAll(Arrays.asList(elements));
    }

    /**
     * Remove this arborescent of the child array
     * @param element A store that implement Arborescent
     */
    public void remove(Arborescent element) {
        child.remove(element);
    }

    /**
     * Remove arborescents of the child array
     * @param elements A store that implement Arborescent
     */
    public void remove(Arborescent... elements) {
        child.removeAll(Arrays.asList(elements));
    }

}