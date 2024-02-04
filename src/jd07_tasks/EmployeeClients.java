package jd07_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "John Soon";
        emp1.age = 35;
        emp1.gender = 'M';
        emp1.jobTitle = "Dev-Ops";
        emp1.salary = 5000;

        emp1.work();
        System.out.println(emp1);

        Employee emp2 = new Employee();
        emp2.name = "Barb Soon";
        emp2.age = 30;
        emp2.gender = 'F';
        emp2.jobTitle = "Full Stack";
        emp2.salary = 4000;

        emp2.work();
        System.out.println(emp2);

    }
}
