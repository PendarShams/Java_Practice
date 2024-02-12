package jd11;

public class CydeoStudentClient {

        public static void main(String[] args) {
            CydeoStudent student1 = new CydeoStudent("Pendar",35,101, 'A', 2222,25);
            CydeoStudent student2 = new CydeoStudent("Jennifer",22,102,'B',2022, 25);

            System.out.println("Student 1:");
            student1.study();
            student1.attendClass();
            CydeoStudent.printSchoolName();
            CydeoStudent.printProgLanguage();
            System.out.println(student1.toString());

            System.out.println("\nStudent 2:");
            student2.study();
            student2.attendClass();
            CydeoStudent.printSchoolName();
            CydeoStudent.printProgLanguage();
            System.out.println(student2.toString());
    }
}
