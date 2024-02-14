package jd12;

public class RectangleClient {
        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle(4, 6);
            Rectangle rectangle2 = new Rectangle(-4, 6);
            Rectangle rectangle3 = new Rectangle(4, 0);

            System.out.println(rectangle1);
            System.out.println(rectangle2);
            System.out.println(rectangle3);

            rectangle1.setWidth(8);
            rectangle1.setLength(12);
            System.out.println("Rectangle 1 new width: " + rectangle1.getWidth());
            System.out.println("Rectangle 1 new length: " + rectangle1.getLength());
            System.out.println(rectangle1);
        }
    }


