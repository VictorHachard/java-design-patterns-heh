package be.isims.ihm.tp1.ex3;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Composite lists = new Composite();
        arb(new File("C:\\Users\\Main\\Desktop\\testFolder"), lists); // Change the path to a folder this will be the entry
        lists.printName();
    }

    /**
     * https://stackoverflow.com/questions/4917326/how-to-iterate-over-the-files-of-a-certain-directory-in-java
     * @param folder Start of the iteration
     * @param lists
     */
    public static void arb(File folder, Composite lists) {
        if (folder.isDirectory()) {
            lists.add(new FolderAr(folder.toString()));
            File[] list = folder.listFiles();
            for (File file:list) {
                lists.add(new FileAr(file.toString()));
            }
            if (list != null) {
                for ( int i = 0; i < list.length; i++) {
                    arb(list[i], lists);
                }
            } else {
                System.err.println(folder + " : Erreur de lecture.");
            }
        }
    }
}
