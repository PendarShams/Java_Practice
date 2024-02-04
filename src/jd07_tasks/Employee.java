package jd07_tasks;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public void work() {
        System.out.println(jobTitle+ " "+ name + " is working.");
    }

    @Override
    public String toString() {
        return "Employee: "+
                "name : " + name+ "\n"+
                "age : " + age + "\n"+
                "gender : " + gender + "\n"+
                "Job title : " + jobTitle+"\n"+
                "Salary : $" + salary ;

    }
}
