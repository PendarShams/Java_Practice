package jd09;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        array(array);
        reversArray(array);
        divBy5(array);
    }

    public static void array(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void reversArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void divBy5(int[] array) {
        for (int number : array) {
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
