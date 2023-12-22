package ro.itschool.sessions2.methods;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        double b = scanner.nextInt();

        System.out.println("Enter the operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Erros: Invalid Operator!");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}