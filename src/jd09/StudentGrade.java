package jd09;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};

        char[] grades = grades(scores);
        System.out.println("Grades = " + Arrays.toString(grades));
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }
    }

    public static char[] grades(int[] scores) {
        char[] grades = new char[scores.length];
        //scores.length bc we need exact output as given scores
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        return grades;
    }
}
