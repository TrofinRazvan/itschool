package ro.itschool.sessions2.variables.localvariables;

public class SumCalculator {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int result = calculateSum(num1,num2);
    }

    public static int calculateSum(int a, int b) {
        int sumResult = a + b;

        System.out.println("The sum of " + a + " and " + b + " is: " + sumResult);
        return sumResult;
    }
}
