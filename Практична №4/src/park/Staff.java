package park;

public class Staff extends Person {
    protected int experienceYears;

    public Staff(String name, int age, int experienceYears) {
        super(name, age);
        this.experienceYears = experienceYears;
    }

    public void work() {
        System.out.println(name + " виконує роботу у парку.");
    }

    @Override
    public String toString() {
        return "Staff{name='" + name + "', experienceYears=" + experienceYears + "}";
    }
}
