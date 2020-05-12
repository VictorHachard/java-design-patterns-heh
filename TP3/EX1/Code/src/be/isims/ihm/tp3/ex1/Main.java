package be.isims.ihm.tp3.ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Input input = new Input();

	    input.addObservers(new BinaryObserver(), new OctalObserver(), new HexaObserver());

        input.setNumber(10);

        Scanner scanner = new Scanner(System.in);

	    while (true) {
            System.out.println("Input int");
            input.setNumber(scanner.nextInt());
        }
    }
}
