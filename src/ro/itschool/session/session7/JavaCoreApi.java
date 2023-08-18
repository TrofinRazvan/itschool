package ro.itschool.session.session7;

public class JavaCoreApi {

    public static void main(String[] args) {
        int a = (3 + 3) * 45;
        int b = 1;
        b = 2;
        String x = "1";
        System.out.println(x + a);
        System.out.println(a + b);

        String name = "George";

        String name1 = "Marius";
        String name2 = "Marius";
        String name3 = new String("Marius");
        System.out.println(name == name1);
        System.out.println(name.equals(name1));
//        System.out.println("name1 vs name 2: " + (name1 == name2));
//        System.out.println("name1 vs name 3: " + (name1 == name3));
//        System.out.println("name1 vs name 3: " + (name1.equals(name3)));
//        System.out.println("name1 hascode: " + Integer.toHexString(System.identityHashCode(name1)));
//        System.out.println("name2 hascode: " + Integer.toHexString(System.identityHashCode(name2)));
//        System.out.println("name3 hascode: " + Integer.toHexString(System.identityHashCode(name3)));
    }
}