package ro.itschool.whatIdid.codewars;

public class StringToArray {

    public static void main(String[] args) {
        String input = "my name is.";
        String[] words = Solution(input);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String[] Solution(String input) {
        input = input.trim();
        String[] words = input.split("\\s+");
        return words;
    }
}
