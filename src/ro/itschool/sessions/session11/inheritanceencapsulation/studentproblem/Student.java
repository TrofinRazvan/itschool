package ro.itschool.sessions.session11.inheritanceencapsulation.studentproblem;

public class Student extends User {

    String studentDescription;

    public String getStudentDescription() {
        return studentDescription;
    }
    public void setStudentDescription(String studentDescription) {
        this.studentDescription = studentDescription;
    }
}