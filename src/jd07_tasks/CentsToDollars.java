package jd07_tasks;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre your cents: ");
        int cents = input.nextInt();
        int dollars = cents/100;
        int remainder = cents%100;

        System.out.println(cents + "is equal to " + dollars + " dollars and " + remainder + " cents");

        input.close();
    }
}
