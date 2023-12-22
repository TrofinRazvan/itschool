package ro.itschool.sessions2.reference;

public class Student {

    String name;
    int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public void displayInfoName() {
        System.out.println("Name: " + name);
        System.out.println();
    }

    public void displayInfoAge() {
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ion");
        Student student2 = new Student("Maria", 21);
        Student student3 = new Student(23);

        student1.displayInfoName();
        student2.displayInfo();
        student3.displayInfoAge();
    }
}