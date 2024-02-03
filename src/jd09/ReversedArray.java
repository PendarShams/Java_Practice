package jd09;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[arr.length]; //defining new array, length bc it should be as long as the existing one

        for (int i = arr.length - 1, j=0 ; i >= 0; i--,j++) {// j is going t help us to define the new data for the new array
 reversedArray [j] = arr[i];
        }
        System.out.println("Reversed array ; " + Arrays.toString(reversedArray));
    }
}
