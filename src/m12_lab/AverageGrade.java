package m12_lab;

public class AverageGrade {
    public static void main(String[] args) {
        double math = 60;
        double chemistry = 85;
        double biology = 90;

        double grade = (math + chemistry + biology)/3 ;

        if ((90<=grade) | (grade<=100)){
            System.out.println("Your grade is A!");
        }else if ((80<=grade) | (grade<=89)){
            System.out.println("Your grade is B!");
        } else if ((70 <= grade) | (grade<= 79)){
            System.out.println("Your grade is C!");
        } else if ((60 <= grade) | (grade <= 69)){
            System.out.println("Your grade is D!");
        } else if ((0<grade) | (grade<= 79)) {
            System.out.println("Your grade is F!");
        } else {
            System.out.println("Invalid");
        }
    }
}

