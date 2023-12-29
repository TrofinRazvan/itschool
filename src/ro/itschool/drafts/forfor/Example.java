package ro.itschool.drafts.forfor;

public class Example {

    public static int staticVariable = 10;

    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public int nonStaticVariable = 20;

    public void nonStaticMethod() {
        System.out.println("This is a non-static method");
    }

//    static {
//        System.out.println(staticVariable);
//        staticMethod();
//    }

    {
        System.out.println(nonStaticVariable);
        nonStaticMethod();
    }

    public static void main(String[] args) {
        System.out.println(staticVariable);
        staticMethod();
        Example exp = new Example();
      exp.nonStaticMethod();
        System.out.println(exp.nonStaticVariable);
    }
}
