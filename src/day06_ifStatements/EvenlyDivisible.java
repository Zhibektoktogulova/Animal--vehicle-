package day06_ifStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 45;

        boolean isDivisibleBy2 = number % 2 ==0;
        //if the remainder of number by 3 is equal  to zero, then it's evenly divisible by 2

        boolean isDivisibleBy3 = number % 3 == 0;
        //if the remainder of number by 3 is equal  to zero, then it's evenly divisible by 3

        boolean isDivisibleBy4 = number % 4 == 0;
        //if the remainder of number by 3 is equal  to zero, then it's evenly divisible by 4


        System.out.println(number + " is evenly divisible by 2: " + isDivisibleBy2);
        System.out.println(number + " is evenly divisible by 3: " + isDivisibleBy3);
        System.out.println(number + " is evenly divisible by 4: " + isDivisibleBy4);




    }
}
