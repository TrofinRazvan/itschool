package ro.itschool.sessions2.reference;

public class Rectangle {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
       return length * width;
    }

    public void resize() {
        length *= 2;
        width *= 2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,2);

        double initialArea = rectangle.calculateArea();
        System.out.println("Initial area: " + initialArea);

        rectangle.resize();

        double resizedArea = rectangle.calculateArea();
        System.out.println("Resized area: " + resizedArea);
    }
}