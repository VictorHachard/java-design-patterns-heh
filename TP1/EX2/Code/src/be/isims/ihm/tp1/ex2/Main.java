package be.isims.ihm.tp1.ex2;

public class Main {

    public static void main(String[] args) {
        City city1 = new City("Tournai");
        City city2 = new City("Mons");

        Province province1 = new Province("Hainaut");
        province1.addComponents(city1, city2);

        city1.addComponents(new Store(10, "Store1"), new Store(30, "Store2"));
        city2.addComponents(new Store(15, "Store3"), new Store(60, "Store4"));

        System.out.println("Province 1 benefice: " + province1.getBenefice());
        System.out.println("City 1 benefice: " + city1.getBenefice());
        System.out.println("City 2 benefice: " + city2.getBenefice());
    }
}
