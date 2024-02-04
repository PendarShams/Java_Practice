package jd06_tasks;

public class OddAndEven1 {
    public static void main(String[] args) {
boolean oddResult = isOdd(100);
boolean evenResult = isEven(100);

        System.out.println("evenResult : " + evenResult);
        System.out.println("oddResult : " + oddResult);
    }

    public static boolean isOdd (int number){
        if ( number % 2 != 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isEven (int number) {
        if (number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }



}
