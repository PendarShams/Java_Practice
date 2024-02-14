package jd13_Employee;

public class EmployeeClients {

    public static void main(String[] args) {
        Tester tester = new Tester("John", 30, "Male", "T001", "Tester", 50_000, "XYZ Company");
        Developper developper = new Developper("J.LO", 52, "Female", "T123", "Developper",
                90_000, "Koona", "Python");
        Teacher teacher = new Teacher("Alice", 40, "Female", "T002", "Teacher", 60_000, "School");
        Driver driver = new Driver("Bob", 45, "Male", "D002", "Driver", 50_000, "Transport");

        System.out.println(tester);
        tester.work();

        System.out.println(developper);
        developper.work();

        System.out.println(teacher);
        teacher.work();

        System.out.println(driver);
        driver.work();
    }
}
