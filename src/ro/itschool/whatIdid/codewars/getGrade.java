package ro.itschool.whatIdid.codewars;

public class getGrade {
    public static void main(String[] args) {
        System.out.println(Grade(85,78,98));
    }
   public static char Grade(int s1, int s2, int s3) {
       s1=(s1+s2+s3)/3;
       return (s1 >= 90) ? 'A':(s1 >= 80) ? 'B':(s1 >= 70) ? 'C':(s1 >= 60) ? 'D':'F';
   }


}
