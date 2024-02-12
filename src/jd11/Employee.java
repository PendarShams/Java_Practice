package jd11;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employee(String name, int age, char gender, String jobTitle, double salary) {
        this(name, age, gender);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working.");
    }

    @Override
    public String toString() {
        return "Employee Info:\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Job Title: " + jobTitle + "\n" +
                "Salary: $" + salary;
    }
}
