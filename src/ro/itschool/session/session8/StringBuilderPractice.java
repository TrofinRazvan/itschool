package ro.itschool.session.session8;

public class StringBuilderPractice {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("test");
        stringBuilder.append("  second part  ");
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(1);
//        System.out.println(stringBuilder);

        String country = "Romania";
        StringBuilder reverseSb = new StringBuilder();
        reverseSb.append(country);
    }
}
