package ro.itschool.session.bankalex;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccountService {
    public static void main(String[] args) {

        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName("Trofin");
        userDetails.setLastName("Razvan");
        userDetails.setEmail("razvantrofin743@yahoo.com");

        UserBankAccount userBankAccount = new UserBankAccount();
        userBankAccount.setUsername("razvan");
        userBankAccount.setBic("alegemrandom");
        userBankAccount.setBalance(6756899);
        userBankAccount.setIban("BCRJIR0HGY367GT8BG3");
        userBankAccount.setUserDetails(userDetails);
        System.out.println("Initial balance:" + userBankAccount.getBalance());

        double balance = userBankAccount.getBalance();
        double amountSpent = 322.12;
        double overflowAmount = 86742909.12;

        BankAccountService bankAccountService = new BankAccountService();
        double valueAtferAtmWithdraw = bankAccountService.atmwithdrawMoney(balance, amountSpent);
        userBankAccount.setBalance(valueAtferAtmWithdraw);
        System.out.println("Updated balance after ATM withdraw: " + userBankAccount.getBalance());

        String currentDay = "Sunday";
        double valueAfterBankWithdraw = bankAccountService.bankWithdrawMoney(currentDay, valueAtferAtmWithdraw, 7832.32);
        userBankAccount.setBalance(valueAtferAtmWithdraw);
        System.out.println("Updated balance after Bank withdraw: " + userBankAccount.getBalance());

    }

    public double atmwithdrawMoney(double balance, double amountWithdraw) {
        if (amountWithdraw > balance) {
            System.out.println("You don't have enought money");
            return balance;

        }
        return balance - amountWithdraw;

    }

    public double bankWithdrawMoney(String currentDay, double balance, double amountWithdraw) {
        List<String> workingDays = new ArrayList<>();
        workingDays.add("Monday");
        workingDays.add("Tuesday");
        workingDays.add("Wednesday");
        workingDays.add("Thursday");
        workingDays.add("Friday");

        if (!workingDays.contains(currentDay)) {
            System.out.println("Please come back from Monday to Friday, from 8 to 16.");
            return balance;
        }

        LocalTime currentTime = LocalTime.now();
        LocalTime morningTime = LocalTime.of(8, 0);
        LocalTime afternoonTime = LocalTime.of(16, 0);
        if (currentTime.isBefore(morningTime) || currentTime.isAfter(afternoonTime)) {
            System.out.println("Please come back from Monday to Friday, from 8 to 16.");
            return balance;
        }

        return balance - amountWithdraw;
    }
}
