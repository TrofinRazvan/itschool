package ro.itschool.drafts.forfor;

public class SmallNumber {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,0,3}, {4,5,6}, {7,8,9}};
        int small = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < small) {
                    small = matrix[i][j];
                }
            }
        }
        System.out.println(small);
    }
}
