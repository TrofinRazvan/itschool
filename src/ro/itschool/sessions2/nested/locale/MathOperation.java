package ro.itschool.sessions2.nested.locale;

public class MathOperation {

    public static void main(String[] args) {
        class SquaredCalculator {
            public int compute(int x) {
                return calculateSquare(x);
            }
        }
        SquaredCalculator calculator = new SquaredCalculator();
        int number = 5;
        int square = calculator.compute(number);

        System.out.println("Square number of " + number + " it is " + square + ".");
    }

    public static int calculateSquare(int x) {
        return x * x;
    }
}