package live_lab_w5;

public class DivideTwoNumber2 {
    public static void main(String[] args) {
divide(100,6);
        
    }
    public static void divide(int dividend, int divisor){
        int remainder = dividend%divisor;
        int count = 0;

        while (divisor <= dividend){
            dividend -= divisor;
            count++;
        }
        System.out.println(count + " with a remainder of " + remainder);
    }

}
