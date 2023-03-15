package ro.itschool.session.session8;

public class JavaCoreApiPractice {

    public static void main(String[] args) {
        String animal1 = "horse";
        String animal2 = "Horse";
        String animal3 ="!Lion";

        String animal4 = "Cheetah";
//        System.out.println(animal4);
        animal4 = "horse";
//        System.out.println(animal4);

//        System.out.println(animal1.replace("h","b").toUpperCase().trim().substring(2,3));
//        System.out.println(animal1.replace("horse","cal").toUpperCase().trim().substring(1,2));
//
//        System.out.println(animal1.charAt(0));
//        System.out.println(animal1.substring(0,3));
//        System.out.println(animal1.toUpperCase());
//        System.out.println(animal1.toLowerCase());

//        System.out.println(animal1.equals(animal4));
//        System.out.println(animal1 == animal4);
        System.out.println(animal1.equalsIgnoreCase(animal2));

//        System.out.println(animal1.startsWith("ho"));
//        System.out.println(animal3.contains("on"));

//        System.out.println(animal3.replace("i",""));


    }

}
