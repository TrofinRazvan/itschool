package ro.itschool.sessions2.methods;

//static method
public class MathOperation {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; //Not-a-Number
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);

        int difference = subtract(num1, num2);
        System.out.println("Difference: " + difference);

        int product = multiply(num1, num2);
        System.out.println("Product: " + product);

        double quotient = divide(num1, num2);
        System.out.println("Quotient: " + quotient);
    }
}
