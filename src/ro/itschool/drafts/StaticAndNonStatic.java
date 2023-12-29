package ro.itschool.drafts;

public class StaticAndNonStatic {

    int x = 3;
    int y = 2;
    static int z = 5;

//    public StaticAndNonStatic() {
//    }

    public static void methodStatic() {
        System.out.println(z);
    }

    public void methodNonStatic() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static void main(String[] args) {
        methodStatic();
        StaticAndNonStatic staticAndNonStatic = new StaticAndNonStatic();
        System.out.println(staticAndNonStatic.y);
        System.out.println(staticAndNonStatic.x);
    }
}