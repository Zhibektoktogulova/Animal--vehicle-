package day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 45;

        boolean isEven = number % 2 == 0; // when we divide the number by 2, if the remainder is 0, means the number is even.
        //boolean isOdd = number % 2 == 0;

        boolean isOdd = !isEven; // If the number is not even, then it's odd

        System.out.println(number + " is an even number: " + isEven );

        System.out.println(number + " is an odd number: " + isOdd);


    }
}
