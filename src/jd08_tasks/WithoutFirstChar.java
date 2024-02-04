package jd08_tasks;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please entre the first word: ");
        String firstWord = input.nextLine();

        System.out.print("Please entre the second word: ");
        String secondWord = input.nextLine();

        System.out.print(firstWord.substring(1));

        input.close();

    }
}
