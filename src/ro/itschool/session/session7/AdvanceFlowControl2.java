package ro.itschool.session.session7;

public class AdvanceFlowControl2 {

    public static void main(String[] args) {
        String[] cars = {"Logan", "Bwm", "Mercedes"};
        //                   0       1        2
//        System.out.println(cars[1]); //Logan
        //index control
        for (int index = 0; index < cars.length; index++) {
//            System.out.println(cars[index]);
        }

        //no index
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
