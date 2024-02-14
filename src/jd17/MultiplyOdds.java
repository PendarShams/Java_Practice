package jd17;


import java.util.HashMap;
import java.util.Map;

public class MultiplyOdds {
    public static Map<Character, Integer> multiplyOddValues(Map<Character, Integer> map) {
        Map<Character, Integer> result = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (value % 2 != 0) {

                result.put(key, value * 2);
            } else {

                result.put(key, value);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);

        Map<Character, Integer> result = multiplyOddValues(map);

        System.out.println("Output:");
        System.out.println(result);
    }
}

