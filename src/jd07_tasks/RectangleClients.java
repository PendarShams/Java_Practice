package jd07_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        rect1.length = 25;
        rect1.width = 15;

        double area = rect1.calculateArea();
        double perimeter = rect1.calculatePerimeter();

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println(rect1);
    }
}
