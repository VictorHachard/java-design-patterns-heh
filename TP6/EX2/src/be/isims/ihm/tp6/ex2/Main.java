package be.isims.ihm.tp6.ex2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Copy.andReplaceWhiteSpace("test.txt", "test2.txt", '_');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
