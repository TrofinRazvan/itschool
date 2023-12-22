package ro.itschool.sessions2.character;

public class Check {

    public static void main(String[] args) {
        System.out.println(countLetterA("sasasa"));
        System.out.println(countLetters("sasasa"));
    }

    public static int countLetterA(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}