package jd05_lab3_while;

public class FINRA {
    public static void main(String[] args) {
int input = 20;
int num = 1;

do {
    if (num % 3 == 0 && num % 5 == 0) {
        System.out.print(" FINRA ");
    }else if ( num % 3 == 0) {
        System.out.print(" FIN ");
    }else if (num % 5 == 0) {
        System.out.print(" RA ");
    }else {
        System.out.print(num + " ");
    }
    num++;
}while (num <= input);
    }
}
