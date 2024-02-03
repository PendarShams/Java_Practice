package jd09;

import java.util.Arrays;

public class MoveTheZero {

    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 0, 1, 0};
        int[] newArr = new int[arr.length];

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == 0)) {
                newArr[num] = arr[i];
                num++;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}



