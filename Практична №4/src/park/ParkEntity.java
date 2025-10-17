package park;

public class ParkEntity {
    protected String name;

    public ParkEntity(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Entity: " + name);
    }

    @Override
    public String toString() {
        return "ParkEntity{name='" + name + "'}";
    }
}
