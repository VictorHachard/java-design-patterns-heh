package be.isims.ihm.tp6.ex1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateFile {

    private String filename;
    private List<String> data;

    public <T> CreateFile(List<T> data, String filename) {
        this.filename = filename;
        this.setData(data);
    }

    public <T> void setData(List<T> data) {
        this.data = data.stream().map(Object::toString).collect(Collectors.toList());
    }

    public void save() {
        try {
            FileWriter fstream = new FileWriter(filename);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(data.toString().replace(",", "\n").replace("[", "").replace("]", ""));
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
