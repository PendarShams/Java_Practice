package live_lab_w4;

public class MortgageCalculator {

    public static void main(String[] args) {

      String loanType = "VA";
      int loanTermInYears = 30;
      int loanAmount = 500_000;
        double annualInterestRate = 0.0;

     switch (loanType) {
         case "fixed":
             if (loanTermInYears == 30) {
                 annualInterestRate = 7.5;
             } else if (loanTermInYears == 15) {
                 annualInterestRate = 6.9;
             }
             break;

         case "FHA":
             if (loanTermInYears == 30) {
                annualInterestRate = 7.24;
             } else if (loanTermInYears == 15)
                 annualInterestRate = 6.62;
                 break;
         case "VA":
             if (loanTermInYears == 30) {
                 annualInterestRate = 6.75;
             } else if (loanTermInYears == 15) {
                 annualInterestRate = 5.99;
             }
             break;
         default:
             System.out.println("Invalid loan type!");
             }

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double numberOfPayments = loanTermInYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        System.out.println("Your monthly mortgage payment for a " + loanTermInYears + " Yr. Fixed loan is : $" + monthlyPayment);
     }}




