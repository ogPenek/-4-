package park;

public class Visitor extends Person {
    private String healthStatus;

    public Visitor(String name, int age, String healthStatus) {
        super(name, age);
        this.healthStatus = healthStatus;
    }

    public void visitAttraction(Attraction a) {
        System.out.println(name + " відвідує " + a.name);
    }

    @Override
    public void greet() {
        System.out.println("Я відвідувач " + name + " і мені " + age + " років");
    }

    @Override
    public String toString() {
        return "Visitor{name='" + name + "', age=" + age + ", healthStatus='" + healthStatus + "'}";
    }
}
