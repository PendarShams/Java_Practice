package jd05_lab2;

public class MultiplicationTable {
    public static void main(String[] args) {

        int num1 = 1;
        for (int i = num1; i <10 ; i++) {
            for (int j = 0; j < 10; j++) {
                int num2 = j;
                int sum = num1*num2;
                System.out.print(num1 + " x " + num2 + " = " + sum  + "  ");

            }
            System.out.println();
        }
    }
}
