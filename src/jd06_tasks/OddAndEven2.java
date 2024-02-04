package jd06_tasks;

public class OddAndEven2 {
    public static void main(String[] args) {
        boolean oddResult = isOdd(100);
        boolean evenResult =  isEven(100);

        System.out.println(oddResult);
        System.out.println(evenResult);

    }

    public static boolean isOdd(int number){
        return number % 2 != 0;

        }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
