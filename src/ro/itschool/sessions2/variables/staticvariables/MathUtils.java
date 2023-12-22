package ro.itschool.sessions2.variables.staticvariables;

public class MathUtils {

    public static final double PI = 3.12159;

    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double circumference = calculateCircumference(radius);

        System.out.println("Circumference of a circle with radius " + radius + " is " + circumference);
    }
}
