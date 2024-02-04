package jd07_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre your score: ");
        int score = input.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Your grade is B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Your score is C");
        } else if (score < 70) {
            System.out.println("You failed");
        } else if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        }
        input.close();
    }
}
