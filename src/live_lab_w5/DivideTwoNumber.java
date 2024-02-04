package live_lab_w5;

public class DivideTwoNumber {
    public static void main(String[] args) {
        divide(100, 6);
    }

    public static void divide(int dividend, int divisor) {
        int result = dividend / divisor;
        int remainder = dividend % divisor;
        if (dividend % divisor == 0) {
            System.out.println(result + " with a reminder of 0");
        } else {
            System.out.println(result + " with a reminder of " + remainder);

        }


    }
}
