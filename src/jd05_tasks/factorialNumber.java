package jd05_tasks;

public class factorialNumber {
    public static void main(String[] args) {

        int factNum = 1;
        int givenNum = 5;


        for (int i = givenNum; i >= 1 ; i--) {
            factNum *= i;
        }
        System.out.println("Factorial Number is : " + factNum);
    }
}
