package be.isims.ihm.tp1.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Province extends Component {

    private String name;
    private List<Component> cities;

    public Province(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }

    @Override
    public double getBenefice() {
        double benefice = 0;
        for (Component citie: cities) {
            benefice += citie.getBenefice();
        }
        return benefice;
    }

    public void addComponent(Component component) {
        cities.add(component);
    }

    public void addComponents(Component... components) {
        cities.addAll(Arrays.asList(components));
    }

}
