package ro.itschool.practice.challenge.challengeone;

public class UniversityApplication {

    public static void main(String[] args) {

        Professor professor1 = new Professor("Daniela","Dijmanescu","F",33,"25.02.1990","225655215","Craiului");
        Professor professor2 = new Professor("Gica","Hagi","M",54,"23.07.1969","151568651","Duetului");

        Course mathCourse = new Course();
        mathCourse.setDescription("math Course Description");
        mathCourse.setDuration("2");
        mathCourse.setProfessor(professor1);


    }
}
