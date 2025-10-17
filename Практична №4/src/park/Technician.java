package park;

public class Technician extends Staff {
    private String specialization;

    public Technician(String name, int age, int experienceYears, String specialization) {
        super(name, age, experienceYears);
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println(name + " перевіряє технічний стан обладнання (" + specialization + ")");
    }

    @Override
    public String toString() {
        return "Technician{name='" + name + "', specialization='" + specialization + "', experience=" + experienceYears + "}";
    }
}
