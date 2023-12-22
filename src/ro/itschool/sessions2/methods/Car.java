package ro.itschool.sessions2.methods;

public class Car {

    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    void printDetails() {
        System.out.println("Brand is " + brand + ", and the model is " + model);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Opel", "Astra");
        Car car2 = new Car("Renault", "Megane");

        car1.printDetails();
        car2.printDetails();
    }
}