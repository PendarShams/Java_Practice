package jd07_tasks;

public class Rectangle {
    public double width;
    public double length;

    public double calculateArea(){
        return width*length;
        //Or double area = length*width
        // soutv(area)
    }
    public double calculatePerimeter(){
        return 2*(width+length);
//Or double perimeter = 2*(length+width)
        //soutv(perimeter)
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
