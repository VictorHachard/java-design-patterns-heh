package be.isims.ihm.tp6.ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCalculFile {

    List<String> files;

    public ReadCalculFile(String... files) {
        this.files = Arrays.asList(files);
    }

    public void read() {
        BufferedReader[] readers = new BufferedReader[files.size()];
        for (int i = 0; i < files.size(); i++) {
            try {
                readers[i] = new BufferedReader(new FileReader(files.get(i)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        boolean noMoreLine = false;
        List<String> concatenation = new ArrayList<>();
        while (!noMoreLine) {
            for (BufferedReader reader : readers) {
                String line = null;
                try {
                    line = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (line == null){
                    noMoreLine = true;
                    System.out.println("no more line");
                    break;
                }
                concatenation.add(line.replace("\n", "").replace(" ", ""));
                if (concatenation.size() == files.size()) {
                    System.out.println(concatenation.toString() + " = " + Double.toString(calcul(concatenation)));
                    concatenation.clear();
                }
            }
        }
    }

    private double calcul(List<String> list) {
        double res = 0.0;
        for (int i = 1; i < list.size(); i++) {
            switch(list.get(i)) {
                case "+":
                    res = Double.parseDouble(list.get(i - 1)) + Double.parseDouble(list.get(i + 1));
                    break;
                case "-":
                    res = Double.parseDouble(list.get(i - 1)) - Double.parseDouble(list.get(i + 1));
                    break;
                case "*":
                    res = Double.parseDouble(list.get(i - 1)) * Double.parseDouble(list.get(i + 1));
                    break;
                case "/":
                    res = Double.parseDouble(list.get(i - 1)) / Double.parseDouble(list.get(i + 1));
                    break;
                default:
                    break;
            }
        }
        return res;
    }

}

