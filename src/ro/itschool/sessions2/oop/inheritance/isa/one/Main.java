package ro.itschool.sessions2.oop.inheritance.isa.one;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Gica", 3);

        dog.eat();
        dog.sleep();

        dog.bark();
        dog.fetch();
    }
}