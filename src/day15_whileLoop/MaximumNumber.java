package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2345666; // 10
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number:");
            int num = input.nextInt(); // 10, 5, 3, 20, 15

            if (num > max) { // if the user entered is greater than the current maximum number that we have
                max = num; // then user entered number should be the maximum number

            }


        }
        System.out.println("maximum number is:  " + max);






    }
}

/*
 Java Programming Day15

 Topics: Branching Statements
 break
 continue

 While Loop Intro

 package name: day15_whileLoop

 Warmup tasks:
 1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number

 2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number

 3. Write a program that can remove the duplicated characters from the a string

 Ex:
 str = "aabbbcccc"

 output:
 abc



 Branching (Jump) statements:
 1. Return
 2. Break
 3. Continue

*/