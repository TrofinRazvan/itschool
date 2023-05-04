package ro.itschool.session.recapsession;

public class FirstLastCharacter {

    public static void main(String[] args) {
        printLetters("Andrei");

    }

    public static void printLetters(String value) {
        value = value.toUpperCase();
        char firstLetter = value.charAt(0);
        char lastLetter = value.charAt(value.length() - 1);
        System.out.println(firstLetter + " " + lastLetter);
    }

}
