package ro.itschool.drafts.forfor;

import java.util.Random;

public class GeneratingRandomValues {

    public static void main(String[] args) {
        int[][] alt = new int[3][3];
        alt[1][2]= 567;
        Random digits = new Random();
        for (int i = 0; i < alt.length; i++) {
            for (int j = 0; j < alt[i].length; j++) {
                if (i != 1 || j != 2) {
                    alt[i][j] = digits.nextInt(34);
                }
                System.out.println(alt[i][j]);
            }
            System.out.println();
        }
    }
}