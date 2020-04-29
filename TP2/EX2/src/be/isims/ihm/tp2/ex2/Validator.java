package be.isims.ihm.tp2.ex2;

public class Validator {

    private String str;
    private Strategy strategy;

    public Validator(String str, Strategy strategy) {
        this.str = str;
        this.strategy = strategy;
    }

    public boolean isValide() {
        return strategy.validator(str);
    }
}
