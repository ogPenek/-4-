package park;

public class Attraction extends ParkEntity {
    protected String type;
    protected int capacity;
    protected double ticketPrice;
    protected boolean isWorking;

    public Attraction(String name, String type, int capacity, double ticketPrice) {
        super(name);
        this.type = type;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
        this.isWorking = false;
    }

    public void open() {
        isWorking = true;
        System.out.println(name + " відкрито!");
    }

    public void close() {
        isWorking = false;
        System.out.println(name + " закрито!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Атракціон: " + name + " (" + type + "), місткість: " + capacity);
    }

    @Override
    public String toString() {
        return "Attraction{name='" + name + "', type='" + type + "', capacity=" + capacity + ", ticketPrice=" + ticketPrice + "}";
    }
}
