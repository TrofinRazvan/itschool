package ro.itschool.drafts;

import java.util.HashSet;
import java.util.Set;

public class SumAndAverageUsingSet {

    public static void main(String[] args) {

        Set<Integer> grades = new HashSet<>();
        grades.add(6);
        grades.add(3);
        grades.add(7);
        grades.add(8);
        grades.add(9);

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
