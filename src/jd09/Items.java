package jd09;

    public class Items {
        public static void main(String[] args) {

            String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
            double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
            int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

            int glovesIndex = findIndex(items, "Gloves");
            System.out.println("Index of Gloves : " + glovesIndex);

            boolean iPad = containsItem(items, "iPad");
            System.out.println("Does the item list contain iPad ? " + iPad);

            shoppingReport(items, prices, itemIDs);
        }

        private static int findIndex(String[] array, String target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(target)) {
                    return i;
                }
            }
            return 0;
        }

        private static boolean containsItem(String[] array, String target) {
            for (String item : array) {
                if (item.equals(target)) {
                    return true;
                }
            }
            return false;
        }

        private static void shoppingReport(String[] items, double[] prices, int[] itemIDs) {
            System.out.println("Shopping Report:");
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
            }
        }
    }

