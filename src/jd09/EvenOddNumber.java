package jd09;

public class EvenOddNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int evenCount = 0;
        int oddCount = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println();
        System.out.println("The array has " + oddCount + " odd numbers and " + evenCount + " even numbers.");
    }
}

