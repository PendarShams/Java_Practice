package jd09;

public class CommonElement2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,4};
        int[] arr2 = {4, 5, 6, 7, 8, 5};

        commonElements(arr1, arr2);
    }

    public static void commonElements(int[] arr1, int[] arr2) {
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.println(num1);
                }
            }
        }
    }
}
