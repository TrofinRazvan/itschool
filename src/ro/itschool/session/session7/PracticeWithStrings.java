package ro.itschool.session.session7;

public class PracticeWithStrings {

    public static void main(String[] args) {
        String animal = "Elephant";
//        System.out.println(animal.indexOf('p'));
//        System.out.println(animal.length());
//        System.out.println(animal.substring(0,3));
//        System.out.println(animal.substring( 3));

        String userInput = " Alex@gmail.com    ";
        String userInputPrepared = userInput.trim().toLowerCase();
        System.out.println("User prepared: " + userInputPrepared);

        String userSavedOnDataBase = "alex@gmail.com";
        if (userInputPrepared.equals(userSavedOnDataBase)) {
            System.out.println("Welcome to the app!");
        }
        for (int index = 0; index < animal.length(); index++) {
            System.out.println(animal.charAt(1));
        }
    }
}