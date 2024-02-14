package jd17;


import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static Map<Character, Integer> mergeMaps(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        Map<Character, Integer> mergedMap = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            mergedMap.put(key, value);
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            mergedMap.put(key, mergedMap.getOrDefault(key, 0) + value);
        }

        return mergedMap;
    }

    public static void main(String[] args) {

        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 10);
        map1.put('B', 20);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('B', 30);
        map2.put('C', 40);

        Map<Character, Integer> mergedMap = mergeMaps(map1, map2);

        System.out.println("Output:");
        System.out.println(mergedMap);
    }
}


