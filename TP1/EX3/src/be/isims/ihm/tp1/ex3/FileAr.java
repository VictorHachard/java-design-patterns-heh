package be.isims.ihm.tp1.ex3;

public class FileAr implements Arborescent {

    private String name;

    /**
     * Class constructor
     * @param name of the files
     */
    public FileAr(String name) {
        this.name = name;
    }


    @Override
    public void printName() {
        System.out.println("file: " + name);
    }

    /**
     * Get the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
