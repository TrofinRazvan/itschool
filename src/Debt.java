public class Debt {

    public static void main(String[] args) {
        Bank bank = new Bank();
        double accountValue = bank.getAccountBalance();
        System.out.println("Account Balance: " + accountValue);
        double shoesPrice = 12.07;
        System.out.println("Balance after shoes payment: " + (accountValue - shoesPrice));
    }
}
