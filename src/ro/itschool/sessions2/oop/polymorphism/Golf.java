package ro.itschool.sessions2.oop.polymorphism;

public class Golf extends Volkswagen{
    @Override
    public double getRoute() {
        return -1;
    }

    @Override
    public void isBeingBuild() {
        System.out.println("Golf is being built.");
    }
}