package ro.itschool.session.session7;

public class BreakStatementExemple {

    public static void main(String[] args) {

        int[][] complexArray = {{3, 2, 1}, {5, 4, 6}, {5, 4, 2}};
        int searchValue = 6;

        int positionX = 0;
        int positionY = 0;
        OUTER_LOOP:for (int i = 0; i < complexArray.length; i++) {
            for (int j = 0; j < complexArray[i].length; j++) {
                if (complexArray[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    System.out.println(positionX + " " + positionY);
                    break OUTER_LOOP;
                }
            }
        }
        if (positionX == 0 || positionY == 0) {
            System.out.println("Value " + searchValue + " was not found");
        }
    }
}
