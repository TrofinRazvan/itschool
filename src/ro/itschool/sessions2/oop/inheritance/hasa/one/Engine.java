package ro.itschool.sessions2.oop.inheritance.hasa.one;

public class Engine {

    private int horsepower;
    private double capacity;
    private String fuelType;

    public Engine(int horsepower, double capacity, String fuelType) {
        this.horsepower = horsepower;
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getFuelType() {
        return fuelType;
    }
}