package ro.itschool.drafts;

import java.util.ArrayList;
import java.util.List;

public class SumAndAverageUsingList {

    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(6);
        grades.add(7);
        grades.add(5);
        grades.add(7);
        grades.add(8);
        int sum = 0;
        double numNotes = grades.size();
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / numNotes;
        System.out.println(sum);
        System.out.println(average);

    }
}
