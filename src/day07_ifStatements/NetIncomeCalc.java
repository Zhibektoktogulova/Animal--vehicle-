package day07_ifStatements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 115000;
        boolean isMarried = true;

        double taxRate = 0;

        if(salary >= 13000){
            taxRate = 0.35;
        }
        if(salary >= 10000 && salary < 130000){
            taxRate = 0.3;
        }
        if(salary >= 80000 && salary < 100000){
            taxRate = 0.25;
        }
        if(salary >= 80000){
            taxRate = 0.2;
        }
       if(isMarried){ // if the person married
           taxRate -= 0.05; // tax is reduced by 5%
       }

       double totalTax =  salary * (1 -taxRate);
       double netIncome = salary - totalTax;
        System.out.println("net income: " + netIncome);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);








    }
}
