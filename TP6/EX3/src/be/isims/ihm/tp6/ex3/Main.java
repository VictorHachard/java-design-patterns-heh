package be.isims.ihm.tp6.ex3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TabFile tf = new TabFile(10, "test");
        tf.add(0, 100);
        tf.add(1, 8);
        tf.add(3, 300);
        tf.add(0, 8000);
        System.out.println(tf.get(0));
        System.out.println(tf.get(1));
        System.out.println(tf.get(3));
    }
}
