package ro.itschool.practice.challenge.challengeone;

public class SchoolInformation {

    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private String CNP;
    private String address;

    public SchoolInformation(String firstName, String lastName, String sex, int age, String dateOfBirth, String CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.address = address;
    }
}