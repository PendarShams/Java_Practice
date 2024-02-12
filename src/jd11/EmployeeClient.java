package jd11;

public class EmployeeClient {
    public static void main(String[] args) {
        // Create multiple Employee objects and test each function
        Employee employee1 = new Employee("Pendar", 35, 'M', "SDET Lead", 120000.0);
        Employee employee2 = new Employee("Maryam", 38, 'F', "Dental Hygienist", 110000.0);


        employee1.work();
        System.out.println(employee1);
        System.out.println("------------------------");
        employee2.work();
        System.out.println(employee2);
    }
}
