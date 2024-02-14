package jd16;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static Set<Integer> findCommonElements(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> commonElements = new HashSet<>(set1);

        commonElements.retainAll(set2);

        return commonElements;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(8);
        set1.add(11);
        set1.add(20);
        set1.add(5);
        set1.add(0);

        Set<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(0);
        set2.add(20);
        set2.add(40);
        set2.add(50);
        set2.add(10);
        set2.add(60);


        Set<Integer> commonElements = findCommonElements(set1, set2);


        System.out.println("Output:");
        System.out.println(commonElements);
    }
}

