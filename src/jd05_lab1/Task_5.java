package jd05_lab1;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("KPH\t\t\t\tMPH");
        System.out.println("---------------------");

        for (int i = 20; i <=140 ; i+=10) {
            double KPH = i;
            double MPH = KPH*0.62;
            System.out.println(KPH + "\t\t\t"+ MPH);


        }
    }
}
