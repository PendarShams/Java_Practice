package jd05_lab3_while;

public class EvenNumbers {

    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        while (num <= 10){
            if (num % 2 == 0){
                sum = sum + num;
            }
            num++;
        }
        System.out.println("Sum of even number = " + sum);
    }
}
