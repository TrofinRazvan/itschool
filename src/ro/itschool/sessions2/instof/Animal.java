package ro.itschool.sessions2.instof;

public class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class Main {
    public static void main(String[] args) {
        Animal myPet = new Dog();

        if (myPet instanceof Dog) {
            System.out.println("Is a dog.");
        } else if (myPet instanceof Cat){
            System.out.println("Is a cat.");
        } else {
            System.out.println("Is not an animal.");
        }
    }
}