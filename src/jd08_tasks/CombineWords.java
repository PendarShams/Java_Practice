package jd08_tasks;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String firstWord = input.nextLine();

        System.out.println("Enter the second word: ");
        String secondWord = input.nextLine();

        String combinedWords = combineWords(firstWord, secondWord);

        System.out.println(combinedWords);

        input.close();
    }

   public static String combineWords(String firstWord, String secondWord) {
       if (!firstWord.isEmpty() && !secondWord.isEmpty() &&
                firstWord.charAt(firstWord.length() - 1) == secondWord.charAt(0)) {
           return firstWord + secondWord.substring(1);

        } else {
           return firstWord + secondWord;
       }
   }
}
