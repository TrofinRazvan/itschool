package ro.itschool.sessions2.variables.instancevariables;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdraw " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234332");

        account.deposit(1000.056);
        account.withdraw(500);

        System.out.println("Account " + account.getAccountNumber() + " has a balance of " + account.getBalance());
    }
}