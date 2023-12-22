package ro.itschool.sessions2.randomscanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name: ");

        String name = s.nextLine();
        s.close();
        System.out.println("Hello, " + name + "!");
    }
}