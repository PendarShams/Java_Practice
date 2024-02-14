package jd12;

public class CircleClient {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(-2);

        System.out.println(circle1);
        System.out.println(circle2);

        circle1.setRadius(10);
        System.out.println("Circle 1 new radius: " + circle1.getRadius());
        System.out.println(circle1);
    }

}
