package ro.itschool.sessions.session14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.someMethod();
    }

    public void someMethod() {
        boolean isConditionTrue = true;

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "George");
        map.put(2, "Mihai");
        map.put(3, "Alin");

        List<String> list = new ArrayList<>();
        list.add("Alina");
        list.add("Elena");
        list.add("Mihaela");

        if (isConditionTrue) {
            for (String name : list) {
                System.out.println(name);
            }
        }
        if (isConditionTrue) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + value);
            }
        }
    }
}