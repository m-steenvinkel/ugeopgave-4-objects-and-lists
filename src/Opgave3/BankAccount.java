package Opgave3;

import java.util.ArrayList;

public class BankAccount {
    private String owner;
    private double balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(String owner, double startBalance) {
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return this.balance;
    }


    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("You have deposited: " + amount);
        System.out.println();
        this.transactions.add(new Transaction("deposit", amount));
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("You have withdrawn: " + amount);
            System.out.println();
            this.transactions.add(new Transaction("withdraw", amount));
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction history: ");
        for (Transaction transaction : this.transactions) {
            System.out.println(transaction);
        }
    }

    public Transaction getLargestTransaction() {
        Transaction largestTransaction = transactions.getFirst();
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i).getAmount() > largestTransaction.getAmount()) {
                largestTransaction = transactions.get(i);
            }
        }
        return largestTransaction;
    }


}
