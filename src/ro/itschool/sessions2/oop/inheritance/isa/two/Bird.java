package ro.itschool.sessions2.oop.inheritance.isa.two;

public class Bird extends Animal {

    private double wingspan;

    public Bird(String name, double wingspan) {
        super(name);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
