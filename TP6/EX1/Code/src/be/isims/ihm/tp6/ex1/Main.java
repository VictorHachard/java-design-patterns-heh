package be.isims.ihm.tp6.ex1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CreateFile cf = new CreateFile(Arrays.asList(1, 2, 3, 4), "number_1.dat");
        cf.save();
        cf = new CreateFile(Arrays.asList(8, 9, 10, 11), "number_2.dat");
        cf.save();
        cf = new CreateFile(Arrays.asList('+', '-', '/', '*'), "operator.dat");
        cf.save();

        ReadCalculFile rcf = new ReadCalculFile("number_1.dat", "operator.dat", "number_2.dat");
        rcf.read();
    }
}
