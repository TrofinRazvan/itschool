package ro.itschool.sessions2.stringsofcharacters;

public class StringClass {

    public static void main(String[] args) {
        String s1 = "";
        if (!s1.isEmpty()) {
            System.out.println(s1.length());
            s1 = s1.trim();
            System.out.println(s1.length());
        } else {
            System.out.println("The String is empty.");
        }

        //charAt
        String input = "Ello";
        char character = input.charAt(1);
        System.out.println(character);

        //compareTo
        String input1 = "apple";
        int result = input.compareTo(input1);
        System.out.println(result);

        //compareToIgnoreCase
        String input2 = "APPLE";
        int result2 = input1.compareToIgnoreCase(input2);
        System.out.println(result2);

        //concat
        System.out.println(input1.concat(input2));

        //contains
        String text = "This is a simple text   ";
        boolean contains = text.contains("simple");
        System.out.println(contains);

        //endsWith && startsWith
        System.out.println(text.startsWith("t"));
        System.out.println(text.endsWith("text"));

        //length
        System.out.println(text.length());

        //trim
        System.out.println(text.trim());

        //valueOf
        double number = 42;
        String str = String.valueOf(number);
        System.out.println(str);

        //isEmpty
        String emptyStr = "";
        boolean isEmpty = emptyStr.isEmpty();
        System.out.println(isEmpty);

        //split
        String string = "anna,parra,marra";
        String[] words = string.split(",");
        for (String word : words) {
            System.out.println(word);
        }

//        String to Number
        String strInt = "123";
        int numarIntreg = Integer.parseInt(strInt);

    }
}