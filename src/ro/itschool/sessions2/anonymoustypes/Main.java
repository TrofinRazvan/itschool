package ro.itschool.sessions2.anonymoustypes;

public class Main {

    public static void main(String[] args) {
        Employee a1 = new Employee(4000, 6);
        Employee a2 = new Employee(2500,3);
        Employee a3 = new Employee(1000, 1) {
            @Override
            public double calculateTheSalary() {
                return 67890.8787;
            }
        };

        System.out.println(a1.calculateTheSalary());
        System.out.println(a2.calculateTheSalary());
        System.out.println(a3.calculateTheSalary());
    }
}