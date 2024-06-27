package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = -20;

        boolean isPositive = number > 0; // if the number is greater than zero, then it's a positive number
        boolean isNegative = number < 0; // if the number is less than zero
       // boolean isZero = number == 0; //if the number is equal to zero, then its zero.

        boolean isZero = !isPositive && !isNegative;

        System.out.println(number + " is a positive number: " + isPositive);
        System.out.println(number + " is a negative number: " + isNegative);
        System.out.println(number + " is a zero number: " + isZero);









    }
}
