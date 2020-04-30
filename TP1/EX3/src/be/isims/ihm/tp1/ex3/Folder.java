package be.isims.ihm.tp1.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Folder extends Component {

    private String name;
    private List<Component> components;

    public Folder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public void addComponents(Component... components) {
        this.components.addAll(Arrays.asList(components));
    }

    public List<Component> getFiles() {
        return this.components;
    }

    @Override
    public String toString() {
        String res = this.name + "\n";
        for (Component component: this.components) {
            res += component.toString();
        }
        return res;
    }
}
