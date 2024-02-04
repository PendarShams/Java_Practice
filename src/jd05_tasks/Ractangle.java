package jd05_tasks;

public class Ractangle {
    public static void main(String[] args) {

        char star = '*';
        int row = 8;
        int column = 9;

        for (int i = 1; i <= column ; i++) {
            for (int j = 1; j <= row ; j++) {
                System.out.print(star + "\t");

            }
            System.out.println();
        }
    }
}


