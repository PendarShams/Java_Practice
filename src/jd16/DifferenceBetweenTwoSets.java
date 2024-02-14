package jd16;

import java.util.HashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {
    public static Set<Integer> calculateDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> difference = new HashSet<>(set1);

        difference.removeAll(set2);

        return difference;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> difference = calculateDifference(set1, set2);

        System.out.println("Output:");
        System.out.println(difference);
    }
}


