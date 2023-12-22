package ro.itschool.sessions2.oop.intabs;

public class Sparrow extends Bird implements Swimmer, Flyer {
    void chirp() {
        System.out.println("Sparrow chirps happily.");
    }

    public void swim() {
        System.out.println("Sparrow swims quickly in water.");
    }

    public void fly() {
        System.out.println("Sparrow flies in the sky.");
    }
}