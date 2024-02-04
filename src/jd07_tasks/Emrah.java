package jd07_tasks;

import java.util.Scanner;

public class Emrah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please entre your name: ");
        String name = input.nextLine();

        System.out.println("Please Entre your family name: ");
        String family = input.nextLine();

        System.out.println("Please entre your age: ");
        int age = input.nextInt();

        char firstLetter = name.charAt(0);

        System.out.println(firstLetter + ", " + family + ", " + age);

        input.close();
    }
}

