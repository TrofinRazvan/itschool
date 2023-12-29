package ro.itschool.sessions.session19;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        Vehicle car = new Car("bmw", 320);
        car.move();
        Vehicle motorcycle = new Motorcycle("honda", 120);
        motorcycle.move();
    }
}

class Vehicle {
    private String name;
    private double speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println(name + " is moving at speed of " + speed + " km/h");
    }
}
class Car extends Vehicle {

    public Car(String name, int speed) {
        super(name, speed);
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(String name, int speed) {
        super(name, speed);
    }
}