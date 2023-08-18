package ro.itschool.practice.bankfeb5;

public class Bank {

    public double getAccountBalance() {
        int x = 100;
        double y = 99.99;
        double account = x + y;
        if (account < 100) {
            System.out.println("Insuficient founds.");
        } else {
            System.out.println("Transaction succefully proceed.");
        }
        return account;
    }
}