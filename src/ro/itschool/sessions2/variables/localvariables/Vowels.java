package ro.itschool.sessions2.variables.localvariables;

public class Vowels {

    public static void main(String[] args) {
        String stringsOfCharacters = "Buenos dias!";
        int result = numberVowels(stringsOfCharacters);

        System.out.println(result);
    }

    public static int numberVowels(String string) {
        int numberVowels = 0;

        string = string.toLowerCase();

        for (int index = 0; index < string.length(); index++) {
            char character = string.charAt(index);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                numberVowels++;
            }
        }
        return numberVowels;
    }
}