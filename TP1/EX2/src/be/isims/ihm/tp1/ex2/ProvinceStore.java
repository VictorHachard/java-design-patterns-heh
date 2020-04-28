package be.isims.ihm.tp1.ex2;

public class ProvinceStore implements Store {

    private Integer id;
    private String name;

    /**
     * Class constructor
     * @param id of the store
     * @param name of the store
     */
    public ProvinceStore(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printStoreName() {
        System.out.println(this.name);
    }

    /**
     * get the id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
