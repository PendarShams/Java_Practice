package jd17;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharacters {
    public static Map<Character, Long> uniqueCharacters(String str) {

        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.entrySet().removeIf(entry -> entry.getValue() > 1);

        return frequencyMap;
    }

    public static void main(String[] args) {

        String string = "aabcccdeeeef";

        Map<Character, Long> uniqueCharsMap = uniqueCharacters(string);
        System.out.println("Output:");
        System.out.println(uniqueCharsMap);
    }
}


