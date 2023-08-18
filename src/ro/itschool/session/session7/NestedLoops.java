package ro.itschool.session.session7;

public class NestedLoops {

    public static void main(String[] args) {
        int[][] complexArray = {{1, 2, 3}, {5, 6, 7}, {9, 7, 5}};

        FIRST_LOOP: for (int[] simpleArray : complexArray) {
            SECOND_LOOP: for (int index = 0; index < complexArray.length; index++) {
                System.out.println(index);
                System.out.println(simpleArray[index] + "\t");
                if (index >1) {
                    break;
                }
            }
        }
    }
}