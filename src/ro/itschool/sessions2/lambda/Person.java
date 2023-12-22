package ro.itschool.sessions2.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}

class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Maria", 23));
        personList.add(new Person("Ioana", 34));
        personList.add(new Person("Francesca", 32));
        personList.add(new Person("Oana", 24));

        personList.stream()
                .filter(person -> person.getName().startsWith("M"))
                        .map(Person::getName)
                                .forEach(System.out::println);

        personList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
//        System.out.println("List sorted by name:");
        for (Person persons : personList) {
//            System.out.println(persons.getName());
        }

        Collections.sort(personList, (p3, p4) -> Integer.compare(p3.getAge(), p4.getAge()));
        for (Person agePerson : personList) {
            if (agePerson.getAge() > 0) {
                System.out.println(agePerson.getName() + " has " + agePerson.getAge() + " years old.");
            }
        }

        double sumAge = 0;
        for (Person person : personList) {
            sumAge  += person.getAge();
        }
        double averageAge = sumAge / personList.size();
        System.out.println("Average age is: " + averageAge);
    }
}