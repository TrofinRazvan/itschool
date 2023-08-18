package ro.itschool.practice.challenge.abstraction.Animal;

public class Main {

    public static void main(String[] args) {
        Animals cats = new Cats();
        cats.sounds();
        Animals dogs = new Dogs();
        dogs.sounds();
    }
}