package ro.itschool.sessions2.oop.inheritance.isa.one;

public class Dog extends Animal{

   public Dog(String name, int age){
       super(name, age);
   }
    public void bark() {
        System.out.println(getName() + ", barks.");
    }

    public void fetch() {
        System.out.println(getName() + ", fetches the ball.");
    }
}