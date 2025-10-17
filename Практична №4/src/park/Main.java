package park;

public class Main {
    public static void main(String[] args) {
        Attraction rollerCoaster = new Attraction("Американські гірки", "екстремальний", 20, 150);
        Visitor ivan = new Visitor("Іван", 25, "немає обмежень");
        Operator petro = new Operator("Петро", 30, 5, rollerCoaster.name);
        Technician oleg = new Technician("Олег", 40, 10, "механік");
        TransactionHistory transaction = new TransactionHistory(ivan.name, 150);

        rollerCoaster.open();
        ivan.visitAttraction(rollerCoaster);
        petro.work();
        oleg.work();
        transaction.displayInfo();

        System.out.println();
        System.out.println(rollerCoaster);
        System.out.println(ivan);
        System.out.println(petro);
        System.out.println(oleg);
        System.out.println(transaction);
    }
}
