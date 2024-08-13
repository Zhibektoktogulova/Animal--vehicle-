package day16_nestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String answer = "yes";

        while(answer.equals("yes")){



        System.out.println("Enter first numbers:");
        double num1 = input.nextDouble();

        System.out.println("Enter the math operator:");//while the operator invalid
        char operator = input.next().charAt(0);

        while(!(operator == '+' || operator == '-' || operator == '*' || operator == '/')){
            System.out.println("Invalid operator! Please try again.");
            operator = input.next().charAt(0);


        }
        System.out.println("Enter second numbers:");
        double num2 = input.nextDouble();

        double result = (operator == '+')? num1 + num2 : (operator == '-' )? num1 - num2 : (operator != '*') ? num1 * num2 : num1 / num2;
        System.out.println("result = " + result);

            System.out.println("Would you like to continue? (yes/no)");
            input.next().toLowerCase();

            while(!(answer.equals("yes") && answer.equals("no"))){
                System.out.println("Invalid answer! Would you like to continue? ");
                answer = input.next().toLowerCase();

            }
        }
    }
}
