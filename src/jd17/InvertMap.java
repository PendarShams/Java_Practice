package jd17;


import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> map) {
        Map<String, Integer> invertedMap = new HashMap<>();


        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            invertedMap.put(entry.getValue(), entry.getKey());
        }

        return invertedMap;
    }

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");


        Map<String, Integer> invertedMap = invertMap(map);

        System.out.println("Output:");
        System.out.println(invertedMap);
    }
}


