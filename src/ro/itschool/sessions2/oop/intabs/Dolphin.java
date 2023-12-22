package ro.itschool.sessions2.oop.intabs;

public class Dolphin extends Animal implements Swimmer {
    void sound() {
        System.out.println("Dolphin makes a clicking sound.");
    }

    public void swim() {
        System.out.println("Dolphins swims grecaefully.");
    }
}