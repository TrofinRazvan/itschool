package ro.itschool.sessions2.stringsofcharacters;

public class StringBClass {

    public static void main(String[] args) {
//        String s1 = "  Hello world! ";
//        if (!s1.isEmpty()) {
//            System.out.println(s1.length());
//            s1 = s1.trim();
//            System.out.println(s1.length());
//            StringBuilder sb1 = new StringBuilder(s1);
//            sb1.reverse();
//            System.out.println(sb1);
//        } else {
//            System.out.println("The string is empty.");
//        }
//
//        int i = 1;
//        StringBuilder sb2 = new StringBuilder();
//        while (i < 100) {
//            sb2.append(i);
//            i++;
//        }
//        System.out.println(sb2);

        //append
        StringBuilder stringBuilder = new StringBuilder("Hello, ");
        int num = 42;
        stringBuilder.append(num);
        System.out.println(stringBuilder.toString());

        //delete
        StringBuilder stringBuilder1 = new StringBuilder("This is another example.");
        stringBuilder1.delete(6,11);
        System.out.println(stringBuilder1.toString());

        //replace
        StringBuilder stringBuilder2 = new StringBuilder("This is another example.");
        stringBuilder2.replace(6,11,"va");
        System.out.println(stringBuilder2.toString());

        //reverse
        StringBuilder stringBuilder3 = new StringBuilder("openAI");
        stringBuilder2.reverse();
        System.out.println(stringBuilder3.toString());

        //subString
        StringBuilder stringBuilder4 = new StringBuilder("substring example");
        String sub1 = stringBuilder4.substring(8);
        String sub2 = stringBuilder4.substring(0,7);
        System.out.println(sub1);
        System.out.println(sub2);

        //setCharAt
        StringBuilder stringBuilder5 = new StringBuilder("Java");
        stringBuilder5.setCharAt(2,'m');
        System.out.println(stringBuilder5.toString());
        int a = 1;
        Integer b = 2;
    }
}