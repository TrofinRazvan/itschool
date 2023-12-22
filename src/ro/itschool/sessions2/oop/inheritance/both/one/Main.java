package ro.itschool.sessions2.oop.inheritance.both.one;

public class Main {

    public static void main(String[] args) {
        Engine carEngine = new Engine("V8");
        Car myCar = new Car("Toyota", 2022, carEngine);

        //"is-a"
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());

        //"has-a"
        System.out.println("Engine type: " + myCar.getEngine().getType());
    }
}
