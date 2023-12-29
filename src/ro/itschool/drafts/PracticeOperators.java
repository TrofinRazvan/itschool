package ro.itschool.drafts;

public class PracticeOperators {
    public static void main(String[] args) {
        int hourofDay = 24;
        if (hourofDay < 11) {
            System.out.println("gm");
        } else {
            System.out.println("gn");
        }



        int horsepower = 250;
        int result = horsepower < 100 ? horsepower - 10 : horsepower +10;
        // ? - daca valoarea este "true", atunci mai aduci cu 10...
        // : - sau
        System.out.println(result);
        String raceResult = horsepower < 100 ? "start race" : "stop race";
        System.out.println(raceResult);

    }
}
