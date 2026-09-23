package Opgave3;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anna", 1000);

        System.out.println("Account balance: " + account.getBalance());
        System.out.println();

        account.deposit(500);
        account.withdraw(200);
        account.deposit(1000);
        account.withdraw(300);
        account.withdraw(5000);

        account.printTransactionHistory();
        System.out.println();

        System.out.println("Account balance: " + account.getBalance());
        System.out.println();

        System.out.println("The largest transaction was " + account.getLargestTransaction());


    }





}
