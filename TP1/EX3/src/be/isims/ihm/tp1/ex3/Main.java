package be.isims.ihm.tp1.ex3;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Folder ft = new Folder("Test");
        Folder ft2 = new Folder("Test2");
        Folder ft3 = new Folder("Test3");
        ft3.addComponent(new Folder("BB2"));
        ft2.addComponents(ft3, new be.isims.ihm.tp1.ex3.File("BB2.txt"));
        ft.addComponents(ft2, new be.isims.ihm.tp1.ex3.File("BB.txt"));
        System.out.println(ft.toString());

        Folder root = new Folder("C:\\Users\\Main\\Documents\\GitHub\\HEH2\\Tp\\Java\\I\\TP1");
        arb(new File("C:\\Users\\Main\\Documents\\GitHub\\HEH2\\Tp\\Java\\I\\TP1"), root, true); // Change the path to a folder this will be the entry
        System.out.println(root.toString());
    }

    /**
     * https://stackoverflow.com/questions/4917326/how-to-iterate-over-the-files-of-a-certain-directory-in-java
     */
    public static void arb(File folder, Folder root, boolean first) {
        if (folder.isDirectory()) {
            if (! first) {
                Folder newFolder = new Folder(folder.toString());
                root.addComponent(newFolder);
                root = newFolder;
            }
            File[] list = folder.listFiles();
            for (File file:list)
                if (! file.isDirectory())
                    root.addComponent(new be.isims.ihm.tp1.ex3.File(file.toString()));
            if (list != null)
                for ( int i = 0; i < list.length; i++)
                    arb(list[i], root, false);
        }
    }
}
