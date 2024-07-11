package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       int sum = 0;

        for (int j = 0; j < 10 ; j++) {
            System.out.println("Enter the number : ");
             sum += input.nextInt();
        }
        System.out.println("sum = " + sum);



    }
}
