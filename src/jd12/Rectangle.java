package jd12;

public class Rectangle {

        private double width;
        private double length;

        public Rectangle(double width, double length) {
            setWidth(width);
            setLength(length);
        }

        public void setWidth(double width) {
            if (width <= 0) {
                System.out.println("Width cannot be negative or zero.");
                System.exit(1);
            } else {
                this.width = width;
            }
        }

        public double getWidth() {
            return width;
        }

        public void setLength(double length) {
            if (length <= 0) {
                System.out.println("Length cannot be negative or zero.");
                System.exit(1);
            } else {
                this.length = length;
            }
        }

        public double getLength() {
            return length;
        }

        public double calcArea() {
            return width * length;
        }

        public double calcPerimeter() {
            return 2 * (width + length);
        }

        public String toString() {
            return "Rectangle [Width=" + width + ", Length=" + length + ", Area=" + calcArea() + ", Perimeter="
                    + calcPerimeter() + "]";
        }
    }



//2. Create a custom class named Rectangle with the following specifications:
//
//	Attributes:
//		width
//		length
//
//	Ensure encapsulation for both fields.
//		Conditions:
//			The width and length cannot be set to negative or zero values.
//
//	Add a constructor that allows the user to set both fields during object creation.
//
//	Actions:
//		calcArea(): Calculates and returns the area of the rectangle object.
//		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
//		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.
//
//	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
