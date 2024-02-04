package m11_lab;

public class EligibleForWork {

    public static void main(String[] args) {

       int birthYear1 = 1985;
       int birthYear2 = 1957;
       int currentYear = 2023;

        int age1 = currentYear - birthYear1;
        System.out.println("age1 = " + age1);
        System.out.println("Am I eligible to work? " + ((age1>18) & (age1<65)));

        int age2 = currentYear - birthYear2;
        System.out.println("age2 = " + age2);
        System.out.println("Am I eligible to work? " + ((age2>18) & (age2<65)));


    }
}
