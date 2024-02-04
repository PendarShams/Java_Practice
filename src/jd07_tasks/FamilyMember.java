package jd07_tasks;

import java.util.Scanner;

public class FamilyMember {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with? ");
        int number = input.nextInt();

       if (number<3){
            System.out.println("Lives with less than three people.");
        //} else if (3<=number && number<=6) {
            //System.out.println("Lives with 3-6 people.");  TOO MUCH OF MEMORY

        } else if (number>6) {
            System.out.println("Lives with more than six people.");
        }else {
            System.out.println("Lives with 3-6 people.");
        }
        input.close();
    }
}
