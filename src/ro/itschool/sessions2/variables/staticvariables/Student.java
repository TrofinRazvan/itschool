package ro.itschool.sessions2.variables.staticvariables;

public class Student {

    private static int numberOfStudents = 56;
    private String name;

    public Student(String name) {
        this.name = name;
        numberOfStudents++;
    }

    public static int getTotalStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Maria");
        Student student2 = new Student("Jira");

        System.out.println("Total students: " + Student.numberOfStudents);;
    }
}