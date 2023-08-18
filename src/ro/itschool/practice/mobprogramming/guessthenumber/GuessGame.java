package ro.itschool.practice.mobprogramming.guessthenumber;

import java.util.Random;

public class GuessGame {

    public void startGame() {

        Random rand = new Random();
        int computerGenerateNumber = rand.nextInt(1, 4);
        System.out.println("Computer generated number: " + computerGenerateNumber);

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();

        player1.setName("Hagi");
        player2.setName("Gica");
        player3.setName("Liga1");

        int player1Guess = player1.getPlayerGuessNumber();
        int player2Guess = player2.getPlayerGuessNumber();
        int player3Guess = player3.getPlayerGuessNumber();

        boolean isGameOn = true;

        while (isGameOn) {
            if (player1Guess == computerGenerateNumber) {
                isGameOn = false;
                System.out.println(player1.getName() + " is the winner");
            } else if (player2Guess == computerGenerateNumber) {
                isGameOn = false;
                System.out.println(player2.getName() + " is the winner");
            } else if (player3Guess == computerGenerateNumber) {
                isGameOn = false;
                System.out.println(player3.getName() + " is a winner");
            }
        }
    }
}