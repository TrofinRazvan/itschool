package ro.itschool.whatIdid;

public class Animal {

    private String animalName;
    private String animaName1 = "Horses";
    private String animalColour;
    public String getAnimalName(){
        return animalName;
    }
    public int getAnimalAge(){
        int someNumber = 23;
        return someNumber;
    }
    public void setAnimalName(){
        animalName = "Squirrel";
    }
    public void setAnimalColour(){
        animalColour = "red";
    }
}
 class Dog extends Animal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.getAnimalName();

    }
}
