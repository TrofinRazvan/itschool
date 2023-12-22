package ro.itschool.sessions2.oop.inheritance.both.two;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Jetta", "Volkswagen", 2020);
        Person person = new Person("Ion",car);

        System.out.println(person.toString());

        System.out.println(person.getName());
        System.out.println(person.getCar().getBrand());
        System.out.println(person.getCar().getModel());
        System.out.println(person.getCar().getYear());
    }
}
