package ro.itschool.sessions2.oop.inheritance.isa.two;

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal("Ciocarlie");
        Bird myBird = new Bird("Azir",2);
        Mammal myMammal = new Mammal("Elixir","blue");

        System.out.println(myAnimal.getName());
        System.out.println(myBird.getName() + " " + myBird.getWingspan());
        System.out.println(myMammal.getName() + " " + myMammal.getFurColor());
        myBird.setWingspan(33);
        System.out.println(myBird.getWingspan());
    }
}