package ro.itschool.sessions2.oop.polymorphism;

public class Main {

    public static void main(String[] args) {
        CarBody c1 = new Polo();
        SmallCar m1 = new Golf();

        c1.isBeingBuild();
        m1.isMoving();
        m1.isBeingBuild();
    }
}