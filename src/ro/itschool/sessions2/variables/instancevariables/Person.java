package ro.itschool.sessions2.variables.instancevariables;

public class Person {

   private String name;
   private int age;
   private String city;

   public Person(String name, int age, String city) {
       this.name = name;
       this.age = age;
       this.city = city;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Person person = new Person("Iuliana", 34, "Bucharest");
        person.displayInfo();
    }
}