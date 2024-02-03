package jd09;

public class GroceryItems2 {

    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        print(items);

        System.out.println("-------------------");

        reversed(items);

        System.out.println("-------------------");

        upSideDown(items);
    }

    private static void print(String[][] items) {
        for (String[] row : items) {
            for (String item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    private static void reversed(String[][] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j] + "\t");

            }
            System.out.println();
        }
    }

    private static void upSideDown(String[][] items) {
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
