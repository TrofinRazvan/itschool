package ro.itschool.sessions2.oop.inheritance.both.two;

public class Person {

    private String name;
    private Car car;

    public Person(String name, Car car){
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String toString() {
        return name + " has a " + car.toString();
    }
}