package m11_lab;

public class Task3Lab2 {
    public static void main(String[] args) {
        int x = 4;
        int y = --x * 4 - x++;
//              (3*4) - 3  ,  x++ changes the value for 4
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
