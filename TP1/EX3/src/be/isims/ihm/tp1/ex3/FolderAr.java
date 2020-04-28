package be.isims.ihm.tp1.ex3;

public class FolderAr implements Arborescent {

    private String name;

    /**
     * Class constructor
     * @param name of the folder
     */
    public FolderAr(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("folder: " + this.name);
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
