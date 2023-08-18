package ro.itschool.whatIdid.all.forfor;

import java.util.Scanner;

public class MultipleStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of words: ");
        String input = scanner.nextLine();
        scanner.close();
        String result = getWordsSeparatedByNewLines(input);
        System.out.println(result);

    }

    public static String getWordsSeparatedByNewLines(String input) {

        String[] words = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word).append("\n");
        }
        return stringBuilder.toString();
    }
}
