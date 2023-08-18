package ro.itschool.practice.challenge.abstraction.Parent;

class Test {

    public static void main(String[] args) {
        Parent firstparent = new First();
        firstparent.message();
        Parent secondparent = new Second();
        secondparent.message();
    }
}