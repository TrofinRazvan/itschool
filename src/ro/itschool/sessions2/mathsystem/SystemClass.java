package ro.itschool.sessions2.mathsystem;

public class SystemClass {

    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        int[] x = new int[5];

        for (int i = 0; i < x.length; i++) {
            x[i] = i;
        }

        for (int i : x) {
            System.out.println(i + " ");
        }
        System.out.println();

        int[] y = new int[6];
        System.arraycopy(x, 0, y, 2, 4);
        y[5] = 10;

        for (int i : y) {
            System.out.println(i + " ");
        }
        System.out.println();
        long l2 = System.currentTimeMillis();
        System.out.println("The execution lasts: " + (l2 - l1) + " milliseconds.");
    }
}