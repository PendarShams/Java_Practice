package jd05_tasks;

public class Alphabet {

    public static void main(String[] args) {


        for ( char upper = 'A';upper <= 'E'; upper++) {
            for (char lower = 'a'; lower <='z' ; lower++) {
                System.out.print(upper + "" + lower + "" + " ");
            }
            System.out.println();
        }
    }
}
