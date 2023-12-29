package ro.itschool.drafts;

public class SumAndAverage {

    public static void main(String[] args) {

        double[] grades = {6, 7.3, 8, 9, 10};
        double numNotes = grades.length;
        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }
        double average = (double) sum / numNotes;
        System.out.println(sum);
        System.out.println(average);

    }
}