package ro.itschool.sessions2.methods;

//instance method
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduceYourself() {
        System.out.println("Name is " + name + " with age " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Razvan", 23);
        Person person2 = new Person("John", 32);

        person1.introduceYourself();
        person2.introduceYourself();
    }
}