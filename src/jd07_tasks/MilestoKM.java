package jd07_tasks;

import java.util.Scanner;

public class MilestoKM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre the miles : ");
        double miles = input.nextDouble();

        double km = miles*1.609;
        System.out.println(miles + " miles is equal to "+km+" kilometers.");

        input.close();
    }
}
