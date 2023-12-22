package ro.itschool.sessions2.oop.inheritance.both.one;

public class Car extends Vehicle {

    private Engine engine;

    public Car(String brand, int year, Engine engine) {
        super(brand, year);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}