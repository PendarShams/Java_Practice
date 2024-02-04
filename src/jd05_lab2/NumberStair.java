package jd05_lab2;

public class NumberStair {
    public static void main(String[] args) {
        char square = '#';
        int num = 6;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num ; j++) {
                if (i == j) {
                    System.out.print(square);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
