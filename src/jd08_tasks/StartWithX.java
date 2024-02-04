package jd08_tasks;

import java.util.Scanner;

public class StartWithX {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter a word: ");
            String word = input.nextLine();

            if (word.startsWith("x")) {
                word = "a" + word.substring(1);
            }
            System.out.println("Output: " + word);

            input.close();
        }
    }

