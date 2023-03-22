package ro.itschool.whatIdid;

public class For {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 7, 9};
        for (int i = 0; i < arr.length; i += 2)
            System.out.println(i);
    }
}
