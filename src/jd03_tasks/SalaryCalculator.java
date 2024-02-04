package jd03_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 50, stateTaxRate = 6, federalTaxRate = 26;
        int weeklyHours = 45;

        double grossSalary = 52*(hourlyRate*weeklyHours);
        double federalTax = grossSalary *(federalTaxRate/100);
        double stateTax = grossSalary*(stateTaxRate/100);
        double totalTax = federalTax + stateTax;
        double netSalary = grossSalary - totalTax;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("stateTaxRate = %" + stateTaxRate);
        System.out.println("federalTax = %" + federalTaxRate);

        System.out.println("----------------------------");

        System.out.println("Gross pay is: $" + grossSalary);
        System.out.println("Federal Tax: $" + federalTax);
        System.out.println("State Tax: $" + stateTax);
        System.out.println("Total Tax: $" + totalTax);
        System.out.println("Net pay is : $" + netSalary);
    }
}
