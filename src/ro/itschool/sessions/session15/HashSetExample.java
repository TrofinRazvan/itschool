package ro.itschool.sessions.session15;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("red");
        set.add("blue");
        set.add("orange");
        set.add("red");

        System.out.println(set);
//        set.removeAll(set);
        System.out.println(set);
        set.add("purple");
//        set.clear();
        System.out.println(set);
        System.out.println(set.size());
    }
}