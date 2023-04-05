package ro.itschool;

import java.util.Optional;
import java.util.Random;

public class OptionalPractice {

    public static void main(String[] args) {
        String name = getName();
        System.out.println(name.equals("Other value"));

        Optional<String> optionalName = Optional.ofNullable(getName());
        String someString = optionalName.get();
            System.out.println(someString.equals("We have a name."));

    }

    static String getName() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber == 0) {
            return "Some value";
        } else {
            return null;
        }
    }
}
