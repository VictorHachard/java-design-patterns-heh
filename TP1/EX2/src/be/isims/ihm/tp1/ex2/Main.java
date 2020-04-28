package be.isims.ihm.tp1.ex2;

public class Main {

    public static void main(String[] args) {
	    Store cityStore = new CityStore(1, "Severine");
        Store provinceStore = new ProvinceStore(2, "Victor");

        CompositeStore compositeStore = new CompositeStore();

        compositeStore.addStore(cityStore, provinceStore);

        compositeStore.printStoreName();
    }
}
