package jd09;

import java.util.Arrays;

public class StudentGrade2 {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};

        char[] grades = calculateGrades(scores);

        System.out.println("Grades = " + Arrays.toString(grades));
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }
    }

    public static char[] calculateGrades(int[] scores) {
        char[] grades = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {
            switch (scores[i] / 10) {
                case 9, 10:
                    grades[i] = 'A';
                    break;
                case 8:
                    grades[i] = 'B';
                    break;
                case 7:
                    grades[i] = 'C';
                    break;
                case 6:
                    grades[i] = 'D';
                    break;
                default:
                    grades[i] = 'F';
                    break;
            }
        }

        return grades;
    }
}

