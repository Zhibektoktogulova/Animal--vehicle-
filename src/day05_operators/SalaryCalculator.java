package day05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 55,
                weeklyHours = 46;
        double stateTaxRate = 7; //Implicit casting
        double federalTaxRate = 24.5;
        //--------------------------------------------

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = hourlyRate * totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);

        System.out.println("-------------------------------------");

        System.out.println("Gross pay is: $" + salaryAfterTax +
                "\nFederal tax is: $" + federalTax+
                "\nState tax is: $" + stateTax +
                "\nTotal tax is: $" + totalTax +
                "\nNet income is: $" + salaryAfterTax);












    }
}
/*
Use the given info in above variables calculate the followings:
     1. Salary Before the tax
     2. state tax
     3. federal tax
     4. total tax
     5. salary after tax
     hint: salary before the tax = hourlyRate * weeklyHour * 52



 */