package ro.itschool.sessions2.anonymoustypes;

public class Employee {

    double salary;
    int yearsOfExperience;

    Employee(double salary, int yearsOfExperience) {
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public double calculateTheSalary() {
        if (yearsOfExperience >= 3) {
            return salary += 500;
        } else {
            return salary;
        }
    }
}