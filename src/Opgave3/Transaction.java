package Opgave3;

public class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public String toString() {
        return "Type: " + this.type + ", Amount: " + this.amount;
    }



}
