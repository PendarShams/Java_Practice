package jd06_tasks;

public class DayAndMonth {
    public static void main(String[] args) {

    }


    public static void day(int dayNum) {
        switch (dayNum) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Number");
        }}


    public static void month(int monthNumber) {
        switch (monthNumber) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid Number");
        }
    }

    public static void daysInMonth(int monthNumber) {
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("This month has 31 days");
            case 4, 6, 9, 11 -> System.out.println("This month has 30 days");
            case 2 -> System.out.println("This month has 28 or 29 days");
            default -> System.out.println("Invalid Number");
        }
    }
}
