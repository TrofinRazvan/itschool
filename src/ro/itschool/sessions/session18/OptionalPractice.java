package ro.itschool.sessions.session18;

import java.util.Optional;
import java.util.Random;

public class OptionalPractice {

    public static void main(String[] args) {
//        String name = getName();
//        System.out.println(name.equals("Other value"));

        Optional<String> optionalName = Optional.ofNullable(getName());
        String someString = optionalName.get();
        System.out.println(someString.equals("Other value")); // we're safe with this; NPE can't occur

        String name = optionalName.orElse("Default");
        System.out.println(name);

        Optional<Integer> optionalLength = optionalName.map(String::length);
        System.out.println(optionalLength.orElse(0));

        User user = null;
        System.out.println(user.getName());

    }
    static String getName() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber == 0) {
            return "Alice";
        } else {
            return null;
        }
    }
}