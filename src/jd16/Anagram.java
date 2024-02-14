package jd16;


import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char ch : str1.toCharArray()) {
            set1.add(ch);
        }

        for (char ch : str2.toCharArray()) {
            set2.add(ch);
        }
        return set1.equals(set2);
    }

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";
        System.out.println("Output for Example 1: " + areAnagrams(str1, str2)); // Output: true

        str1 = "xyze";
        str2 = "xyzd";
        System.out.println("Output for Example 2: " + areAnagrams(str1, str2)); // Output: false
    }
}

