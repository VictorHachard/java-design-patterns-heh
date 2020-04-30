package be.isims.ihm.tp1.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City extends Component {

    private String name;
    private List<Component> stores;

    public City(String name) {
        this.name = name;
        this.stores = new ArrayList<>();
    }

    @Override
    public double getBenefice() {
        double benefice = 0;
        for (Component store: stores) {
            benefice += store.getBenefice();
        }
        return benefice;
    }

    public void addComponent(Component component) {
        stores.add(component);
    }

    public void addComponents(Component... components) {
        stores.addAll(Arrays.asList(components));
    }

}
