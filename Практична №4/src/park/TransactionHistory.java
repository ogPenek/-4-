package park;

import java.time.LocalDate;

public class TransactionHistory extends ParkEntity {
    private double amount;
    private LocalDate date;

    public TransactionHistory(String visitorName, double amount) {
        super(visitorName);
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public void refund() {
        System.out.println("Повернення коштів для " + name + ": " + amount + " грн");
    }

    @Override
    public void displayInfo() {
        System.out.println("Транзакція для " + name + " на суму " + amount + " грн (" + date + ")");
    }

    @Override
    public String toString() {
        return "Transaction{name='" + name + "', amount=" + amount + ", date=" + date + "}";
    }
}
