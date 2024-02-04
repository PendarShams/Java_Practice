package jd05_tasks;

public class FINRA {
    //Create a class named FINRA. and write a program that prints the numbers from 1 to 100. For numbers that
    //are multiples of both 3 and 5, print "FINRA" instead of the number. For numbers that are multiples of 3, print
    //"FIN" instead of the number, and for numbers that are multiples of 5, print "RA" instead of the number.
    public static void main(String[] args) {

        int givenNum = 100;
        int num = 1;

        for (int i = 1; i <= givenNum; i++) {
            if (i%3==0 && (i&5)==00) {
                System.out.print("FINRA ");
            } else if (i%3==0) {
                System.out.print("FIN ");
            }else if (i%5==0) {
                System.out.print("RA ");
            }else{
                System.out.print(i + " ");

            }

        }
    }
}
