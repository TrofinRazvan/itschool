package ro.itschool.sessions2.oop.inheritance.isa.two;

public class Mammal extends Animal {

    private String furColor;

    public Mammal(String name, String furColour) {
        super(name);
        this.furColor = furColour;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}