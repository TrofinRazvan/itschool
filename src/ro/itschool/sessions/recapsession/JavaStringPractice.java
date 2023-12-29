package ro.itschool.sessions.recapsession;

public class JavaStringPractice {

    public static void main(String[] args) {

        System.out.println(getCharOccurences("Hello, World!", 'l'));
//        String name = "   George  ";
//        String nameTrimmed = name.trim();
//        System.out.println(nameTrimmed);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("  George  ");
//        sb.append(" and Maria ");

//        System.out.println(getStringUpperCase("Hello   "));
    }

    private static int getStringLength(String string) {
        return string.length();
    }

    private static String getStringUpperCase(String string) {
        return string.trim().toUpperCase();
    }

    private static int getCharOccurences(String input, char character) {
        char[] chars = input.toCharArray();
        int occurences = 0;
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == character) {
                occurences++;
            }
        }
        return character;
    }
}