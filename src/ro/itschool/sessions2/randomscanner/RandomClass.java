package ro.itschool.sessions2.randomscanner;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt();
        int y = random.nextInt();
        double d = random.nextInt();
        boolean b = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(d);
        System.out.println(b);
    }
}