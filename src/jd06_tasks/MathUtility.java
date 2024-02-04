package jd06_tasks;

public class MathUtility {
    public static void main(String[] args) {
int result1 = calculate(5, 6, '+');
        System.out.println("result1 = " + result1);

    }

    public static int calculate(int num1, int num2, char math) {

        switch (math) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                System.out.println("Invalid!");
                return 0;
        }
    }

    public static double calculate(double num1, double num2, char math) {

        switch (math) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                System.out.println("Invalid!");
                return 0;
        }
    }

    // Method to calculate the square of an integer or double
    public static int square(int num) {

        return num*num;
    }

    public static double square(double num) {

        return num*num;
    }

    public static int cube(int num) {
        return num*num*num;
    }
    public static double cube(double num) {
        return num*num*num;
    }

}
