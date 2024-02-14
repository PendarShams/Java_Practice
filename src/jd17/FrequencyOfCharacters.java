package jd17;


import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static Map<Character, Integer> frequencyOfCharacters(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {

        String string = "bbcccaaaaa";

        Map<Character, Integer> frequencyMap = frequencyOfCharacters(string);

        System.out.println("Output:");
        System.out.println(frequencyMap);
    }
}

