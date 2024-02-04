package jd05_tasks;

public class Triangle {
    //Create a class named Triangle
    // and use a nested loop to display the following shape on the console:

    public static void main(String[] args) {

        char star = '*';
        int num = 10;

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(star + " ");

            }
            System.out.println();
        }

    }
}
