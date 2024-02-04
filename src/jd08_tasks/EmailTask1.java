package jd08_tasks;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an email address: ");
        String email = input.nextLine();

        String newEmail = swapFirstLast(email);

        System.out.println( newEmail);

        input.close();
    }

    public static String swapFirstLast(String email) {
        int indexUnder = email.indexOf('_');
        int indexA = email.indexOf("@");

        if (email.contains("_")) {
            String first = email.substring(0, indexUnder);
            String last = email.substring(indexUnder + 1,indexA);
            String end = email.substring(indexA);

            return last + "_" + first+end;

        }else {

                return email;
            }
        }

    }

