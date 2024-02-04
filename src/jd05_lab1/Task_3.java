package jd05_lab1;

public class Task_3 {
    public static void main(String[] args) {
int sumEven =0;
int sumOdd = 0;

        for(int i = 0; i <= 10; i+=2) {
            sumEven += i;
        }
        for (int i = 1; i < 10; i+=2) {
sumOdd += i ;
        }
        System.out.println("sumOdd = " + sumOdd);
        System.out.println("sumEven = " + sumEven);
        System.out.println("--------------------");


    }
}
