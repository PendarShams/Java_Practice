package m11_lab;

public class Task1Lab3 {
    public static void main(String[] args) {

     int b = 2;
     boolean result = (++b == 2 || b == 2) && --b ==2;
        System.out.println(result);
        System.out.println(b);
    }
}
