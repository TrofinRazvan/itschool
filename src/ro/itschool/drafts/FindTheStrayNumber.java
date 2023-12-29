package ro.itschool.drafts;

import java.util.HashMap;
import java.util.Map;

public class FindTheStrayNumber {

    public static void main(String[] args) {
        int[] arr = {17, 17, 3, 17, 4,17, 17, 17};
        System.out.println(stray(arr));
    }

    public static int stray(int[] numbers) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : numbers) {
            map.put(n, map.containsValue(n) ? map.get(n) + 1 : 1);
        }
        for (int n : map.keySet()) {
            if (map.get(n) == 1) {
                result = n;
            }
        }
        return result;
    }
}