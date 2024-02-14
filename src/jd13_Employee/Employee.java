package jd13_Employee;

public class Employee extends Person{
    private String employeeId, jobTitle, companyName;
    private double salary;

    public Employee(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(jobTitle + " " + getName() + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId +
                ", jobTitle='" + jobTitle +
                ", salary=" + salary +
        ", companyName='" + companyName +
                "} " + super.toString();
    }
}

