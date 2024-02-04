package jd05_tasks;
// 4. Create a class named SumOfNumbers and write a
// program to calculate the sum of all numbers between 1 and any given number.
public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int givenNum = 50;

        for (int i = 1; i <= givenNum ; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers = " + sum);

    }
}
