public class Bank {

    public double getAccountBalance(){
        int x = 100;
        double y = 99.99;
        double account = x + y;
        if (account < 100) {
            System.out.println("insuficient founds");
        } else {
            System.out.println("transaction succefully proceed");
        }
        return account;

    }
}
