package jd12;

public class ItemClient {
        public static void main(String[] args) {
            Item item1 = new Item("Apple", 1.5, 10);
            Item item2 = new Item("", 2.0, 5);
            Item item3 = new Item("123Orange", 1.0, 3);
            Item item4 = new Item("Banana", -1.0, 8);
            Item item5 = new Item("Mango", 2.0, -2);

            System.out.println(item1);
            System.out.println(item2);
            System.out.println(item3);
            System.out.println(item4);
            System.out.println(item5);

            item1.setQuantity(20);
            System.out.println("Item 1 new quantity: " + item1.getQuantity());
            System.out.println(item1);
        }
    }


