package jd07_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Entre your product name : ");
        String name = input.nextLine();

        System.out.print("Entre the price : ");
        double price = input.nextDouble();

        System.out.print("Entre the quantity : ");
        int quan = input.nextInt();

        System.out.print("Entre your first name : ");
        String firstName = input.next();

        double total = price*quan;

        System.out.println(firstName+", your order for "+quan+" "+name+" has been placed. Your total is "+ total);

        input.close();
    }
}
