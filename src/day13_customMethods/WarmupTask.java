package day13_customMethods;

import java.util.Scanner;

public class WarmupTask {
    public static void main(String[] args) {

        calculate(200, 5, '/');
        calculate(1, 100, '-');

        /* Scanner input = new Scanner(System.in);
        System.out.println("Enter your two numbers and a math operator: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        char operator = input.next().charAt(0);
        calculate(n1, n2, operator);
*/
        System.out.println("--------------------------------------------------------");



    }

    public static void calculate(double num1, double num2, char mathOperator ) {

        switch (mathOperator) {
            case '+':
                System.out.println(num1 +" "+mathOperator+ " "+ num2 +" "+ (num1+num2) );
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 +" = "+ (num1-num2) );
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " "+ num2 +" = "+ (num1*num2) );
                break;
            case '/':
                System.out.println(num1 + " " +mathOperator + " " + num2 +" = "+ (num1/num2) );
                break;
            default:
                System.out.println("Invalid math operator: " + mathOperator);
                break;
        }
    }
}
