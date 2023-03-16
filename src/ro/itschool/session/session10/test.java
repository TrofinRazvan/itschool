package ro.itschool.session.session10;

public class test {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 5, 8, 5, 6, 9};

        int maxInt = 0;

        int index = -1;
        for (int j : arr)
            if (j > maxInt) {
                maxInt = j;
            }
        System.out.println(maxInt);
    }
}

