package jd11;

public class CarpetClient {
        public static void main(String[] args) {
            // Create multiple Carpet objects and test each function
            Carpet carpet1 = new Carpet(8.0, 10.0, 5.0, false);
            Carpet carpet2 = new Carpet(6.0, 12.0, 8.0, true);


            System.out.println(carpet1);
            System.out.println("--------------------");
            System.out.println(carpet2);
        }
    }
