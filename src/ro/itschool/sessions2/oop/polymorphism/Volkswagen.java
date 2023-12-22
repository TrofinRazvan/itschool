package ro.itschool.sessions2.oop.polymorphism;

public abstract class Volkswagen extends SmallCar {
    public abstract double getRoute();

    void isMoving(){
        System.out.println("Volkswagen is moving.");
    }
}