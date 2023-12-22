package ro.itschool.sessions2.oop.inheritance.hasa.one;

public class Car {

    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return engine.getHorsepower();
    }

    public double getCapacity() {
        return engine.getCapacity();
    }

    public String getFuelType() {
        return engine.getFuelType();
    }
}