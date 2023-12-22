package ro.itschool.sessions2.oop.intabs;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.chirp();

        Animal animal = new Dolphin();
        animal.sound();

        Flyer bird1 = new Sparrow();
        bird1.fly();

        Swimmer animal1 = new Dolphin();
        animal1.swim();
    }
}