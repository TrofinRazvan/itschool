package ro.itschool.sessions2.reference;

public class Car {

    public static void main(String[] args) {
        Car car1 = new Car("Opel", "Astra", 2012);
        Car car2 = new Car("Mazda", "CX", 2020);
        Car car3 = new Car("Opel", "Corsa", 2017);

//        car1.displayInfo();
//        car2.displayInfo();
//        car3.displayInfo();
        System.out.println(car1.brand + " " + car1.model + " " +car1.year);
    }

        String brand;
        String model;
        int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public void displayInfo() {
//        System.out.println("Brand: " + brand);
//        System.out.println("Model: " + model);
//        System.out.println("Year: " + year);
//        System.out.println();
//    }
}