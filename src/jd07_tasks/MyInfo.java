package jd07_tasks;

import java.util.Scanner;

public class MyInfo {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int age = input.nextInt();

            System.out.print("Enter your gender: ");
            String gender = input.next();
input.nextLine();

            System.out.print("Enter your full name: ");
            String fullName = input.nextLine();

            System.out.print("Enter your phone number: ");
            long phone = input.nextLong();

            System.out.print("Enter your zip code: ");
            int zipCode = input.nextInt();
input.nextLine();

            System.out.print("Enter your School name: ");
            String school = input.nextLine();

            System.out.print("Enter your city: ");
            String city = input.nextLine();

            System.out.print("Enter your state: ");
            String state = input.next();

            System.out.print("Enter your building number: ");
            int buildingNumber = input.nextInt();
input.nextLine();

            System.out.print("Enter your Street name: ");
            String street = input.nextLine();

            System.out.println(fullName +
                    "\n" + age+
                    "\n"+ gender+
                    "\n"+phone+
                    "\n Address: \n" + buildingNumber + " " + street+
                    "\n"+city+", "+state+" "+zipCode
                    );

            input.close();

        }
    }

