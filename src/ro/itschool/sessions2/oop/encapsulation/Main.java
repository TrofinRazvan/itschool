package ro.itschool.sessions2.oop.encapsulation;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Mircea");
        person.setAge(23);
        person.setGender("male");
        System.out.println(person.getName() + " " + person.getAge() + " " + person.getGender());
    }
}
