package jd16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class RemoveDuplicates {
    public static List<Integer> removeAndSortDuplicates(List<Integer> numbers) {
        // Create a set to store unique elements
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Create a list to store unique elements in sorted order
        List<Integer> sortedUniqueNumbers = new ArrayList<>(uniqueNumbers);

        // Sort the list
        Collections.sort(sortedUniqueNumbers);

        return sortedUniqueNumbers;
    }

    public static void main(String[] args) {
        // Input list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(15);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(15);
        numbers.add(0);

        // Remove duplicates and sort the list
        List<Integer> result = removeAndSortDuplicates(numbers);

        // Print the sorted unique elements
        System.out.println("Output:");
        System.out.println(result);
    }
}


