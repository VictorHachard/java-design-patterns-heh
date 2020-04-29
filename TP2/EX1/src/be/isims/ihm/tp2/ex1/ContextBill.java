package be.isims.ihm.tp2.ex1;

public class ContextBill {

    private Strategy strategy;
    private double num;

    /**
     * Simple constructor
     * @param num the bill
     */
    public ContextBill(double num) {
        this.num = num;
        this.strategy = new Belgium();
    }

    /**
     * Get the bill
     * @return num
     */
    public double getNum() {
        return num;
    }

    /**
     * Set the bill
     * @param num
     */
    public void setNum(double num) {
        this.num = num;
    }

    /**
     * Set the Strategy to use
     * @param strategy
     */
    public void setContext(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return strategy.toString(num);
    }
}
