package ro.itschool.practice.challenge.bank;

public class BankABC {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        bankA.getBalance();

        BankB bankB = new BankB();
        bankB.getBalance();
        BankC bankC = new BankC();
        bankC.getBalance();

    }
}
