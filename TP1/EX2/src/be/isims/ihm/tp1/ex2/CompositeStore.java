package be.isims.ihm.tp1.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeStore implements Store {

    private List<Store> childStore;

    /**
     * Class constructor
     */
    public CompositeStore() {
        this.childStore = new ArrayList<>();
    }

    @Override
    /**
     * Print all store print methods
     */
    public void printStoreName() {
        childStore.forEach(Store::printStoreName);
    }

    /**
     * Add this store to the child array
     * @param store A store that implement Store
     */
    public void addStore(Store store) {
        childStore.add(store);
    }

    /**
     * Add stores to the child array
     * @param stores A store that implement Store
     */
    public void addStore(Store... stores) {
        childStore.addAll(Arrays.asList(stores));
    }

    /**
     * Remove this store of the child array
     * @param store A store that implement Store
     */
    public void removeStore(Store store) {
        childStore.remove(store);
    }

    /**
     * Remove stores of the child array
     * @param stores A store that implement Store
     */
    public void removeStore(Store... stores) {
        childStore.removeAll(Arrays.asList(stores));
    }

}
