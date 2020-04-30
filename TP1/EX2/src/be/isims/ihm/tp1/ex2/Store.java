package be.isims.ihm.tp1.ex2;

public class Store extends Component {

    private double benefice;
    private String name;

    public Store(double benefice, String name) {
        this.benefice = benefice;
        this.name = name;
    }

    @Override
    public double getBenefice() {
        return benefice;
    }

}
