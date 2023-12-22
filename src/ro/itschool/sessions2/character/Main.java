package ro.itschool.sessions2.character;

public class Main {

    public static void main(String[] args) {
//        isDigit(char ch)
        char character = '7';
        if (Character.isDigit(character)) {
            System.out.println(character + " este o cifră.");
        }

//        isLetter(char ch)
        char character1 = 'A';
        if (Character.isLetter(character1)) {
            System.out.println(character1 + " este o literă.");
        }

//         isWhitespace(char ch)
        char character3 = ' ';
        if (Character.isWhitespace(character3)) {
            System.out.println("Caracterul este un spațiu alb.");
        }

//        isUpperCase(char ch)
        char character4 = 'C';
        if (Character.isUpperCase(character4)) {
            System.out.println(character4 + " este o literă mare.");
        }

//        isLowerCase(char ch)
        char character5 = 'c';
        if (Character.isLowerCase(character5)) {
            System.out.println(character5 + " este o literă mică.");
        }

//        toUpperCase(char ch)
        char character6 = 'a';
        char caracterMare = Character.toUpperCase(character6);
        System.out.println("Caracterul mare este: " + caracterMare);

//        toLowerCase(char ch)
        char character7 = 'Z';
        char caracterMic = Character.toLowerCase(character7);
        System.out.println("Caracterul mic este: " + caracterMic);
    }
}