package ro.itschool.practice.mobprogramming.guessthenumber;

import java.util.Random;

public class Player {

    private String name;

    public int getPlayerGuessNumber() {
        Random rand = new Random();
        return rand.nextInt(1, 4);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}