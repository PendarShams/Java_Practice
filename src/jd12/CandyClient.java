package jd12;

public class CandyClient {
        public static void main(String[] args) {
            Candy candy1 = new Candy("Chocolate Bar", 5, 2.5, true);
            Candy candy2 = new Candy("Lollipop", -3, 1.0, false);
            Candy candy3 = new Candy("Gummy Bears", 10, -1.0, true);

            System.out.println(candy1);
            System.out.println(candy2);
            System.out.println(candy3);

            candy1.setQuantity(10);
            System.out.println("Candy 1 new quantity: " + candy1.getQuantity());
            System.out.println(candy1);
        }
    }


