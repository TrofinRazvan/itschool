package ro.itschool.drafts;

public class Another {

    public static void main(String[] args) {
        System.out.println(position("G"));
    }

    public static String position(String alphabet) {
        String igonore = alphabet.toLowerCase();
        for (int i = 'a'; i <= 'z'; i++) {
            if (igonore.equals(String.valueOf((char)i))) {
                return "Position of " + alphabet + " is on index " + (i - 'a' + 1);
            }
        }
        return "Character not found in the alphabet";
    }
}