package jd09;

import java.util.Arrays;

public class Items2 {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int glovesIndex = 0;
       for (int i = 0; i < items.length; i++) {
          if (items[i].equals("Gloves")) {
              glovesIndex = i;
               }}
        System.out.println("Index of  Gloves : " + glovesIndex);

        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                System.out.println("Does the item list contain iPad ? True");

            }
        }


        System.out.println("Shopping Report:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }
    }

}
