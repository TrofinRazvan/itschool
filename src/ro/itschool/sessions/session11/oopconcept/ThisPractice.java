package ro.itschool.sessions.session11.oopconcept;

public class ThisPractice {

    int age;
    int height;

    public ThisPractice(int age) {
        this.age = age;
        System.out.println("first constructor was called");
    }

    public ThisPractice(int age, int height) {
        this(age);
        this.age = age;
        this.height = height;
    }

    void getName() {
    }
    void getAge() {
        this.getName();
    }
}