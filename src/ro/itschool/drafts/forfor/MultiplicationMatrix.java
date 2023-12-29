package ro.itschool.drafts.forfor;

import java.util.Random;

public class MultiplicationMatrix {

    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        matrix1[1][1] = 3;
        int[][] matrix2 = new int[3][3];
        matrix2[1][1] = 3;
        int[][] result = new int[matrix1.length][matrix2[0].length];
        Random digits = new Random();

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                        matrix1[i][j] = digits.nextInt(10);
                        matrix2[i][j] = digits.nextInt(10);
                }
            }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++)
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }

        result[1][1] = 9;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int n = 3;
        int[][] array = new int[n][n];

// Inițializare matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

// Afișare matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}