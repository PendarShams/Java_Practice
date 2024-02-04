package m12_lab;

public class GreaterNumberNestedIf {

    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 9;

        if (num1 != num2) {
            System.out.println("Numbers are not equal.");
            if (num1 > num2) {
                System.out.println("the num1 is greater than num2.");
            } else if (num2 > num1) {
                System.out.println("the numb2 is greater than num1.");
            }
        }else{
            System.out.println("The numbers are equal.");
        }
    }
}

