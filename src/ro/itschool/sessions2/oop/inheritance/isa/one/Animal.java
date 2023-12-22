package ro.itschool.sessions2.oop.inheritance.isa.one;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age){
        this.name =name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating bones every day.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping right now.");
    }

    public String getName(){
        return name;
    }
}