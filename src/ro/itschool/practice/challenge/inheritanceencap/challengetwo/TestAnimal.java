package ro.itschool.practice.challenge.inheritanceencap.challengetwo;

class TestAnimal extends Animal {


    public static void main(String[] args) {
        Dog Dog = new Dog();
        Dog.sound();
        Dog.eat();
        Cat Cat = new Cat();
        Cat.sound();
        Cat.eat();
        Wolf Wolf = new Wolf();
        Wolf.sound();
        Cat.eat();
        TestAnimal Animal = new TestAnimal();
        Animal.sound();
        Animal.eat();
        Animal.age();
    }

}
