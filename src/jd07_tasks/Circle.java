package jd07_tasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre the radius: ");
        double radius = input.nextDouble();

        double area = 3.14 * (radius * radius);
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Perimeter of the circle is " + perimeter);
        System.out.println("Area of the circle is " + area);

        input.close();
    }
}
