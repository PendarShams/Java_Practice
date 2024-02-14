package jd16;


import java.util.ArrayList;
import java.util.List;

public class RemovePalindromes {
    public static List<String> removePalindromes(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String str : list) {

            if (!isPalindrome(str)) {
                result.add(str);
            }
        }

        return result;
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Cydeo");
        list.add("Car");
        list.add("Level");
        list.add("civic");
        list.add("radar");
        list.add("kayak");
        list.add("reviver");
        list.add("racecar");
        list.add("madam");


        List<String> result = removePalindromes(list);

        System.out.println("Output:");
        System.out.println(result);
    }
}


