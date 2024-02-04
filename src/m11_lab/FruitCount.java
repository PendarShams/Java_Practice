package m11_lab;

public class FruitCount {

    public static void main(String[] args) {

        int appleCount = 6;
        int orangeCount = 7;
        int strawberryCount = 8;

        boolean result = (appleCount< orangeCount) | (orangeCount >= strawberryCount);
        System.out.println("result = " + result);
    }
}
