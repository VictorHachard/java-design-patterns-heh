package be.isims.ihm.tp1.ex3;

public class File extends Component {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\n";
    }
}
