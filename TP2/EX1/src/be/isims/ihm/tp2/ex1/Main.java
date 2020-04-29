package be.isims.ihm.tp2.ex1;

public class Main {

    public static void main(String[] args) {
        ContextBill bill = new ContextBill(50.50);

        System.out.println("Par défaut (Belgique)");
        System.out.println("---------------------");
        System.out.println(bill.toString());

        bill.setContext(new UnitedKingdom());
        System.out.println("\nRoyaume-Uni");
        System.out.println("----------");
        System.out.println(bill.toString());
    }
}
