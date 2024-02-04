package m10_practice;

public class EmployeeInfo {

    public static void main (String [] args){

        String employeeName = "Bolbol";
        int age = 20;
        char gender = 77;
        String companyName = "AtlasAir";
        String jobTitle = "Pilot";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = true;
        String employeeId = "B101";

        System.out.println("Employee name : " + employeeName + "\nGender : " + gender
        + "\nAge : " + age + "Employee ID : " + employeeId + "\nJob title : " +
                jobTitle + "\nCompany name : " + companyName + "\nFull time : "
        + isFullTime + "\nYears of work experience : " + yearsOfExperience + " years"
        + "\nSalary : $" + salary + "\nMarried : " + isMarried);

    }
}
