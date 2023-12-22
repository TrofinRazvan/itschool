package ro.itschool.sessions2.oop.inheritance.hasa.one;

public class Main {

    public static void main(String[] args) {
        Engine carEngine = new Engine(145, 2.0,"benzine");
        Car myCar = new Car("Toyota","Camry", carEngine);

        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model:" + myCar.getModel());
        System.out.println("Horsepower: " + myCar.getHorsepower());
        System.out.println("Capacity: " + myCar.getCapacity());
        System.out.println("Fuel Type: " + myCar.getFuelType());
    }
}