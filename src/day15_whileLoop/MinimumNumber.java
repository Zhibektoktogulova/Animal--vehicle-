package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          int min = 1223333;

          for (int i = 0; i < 5; i++) {
              System.out.println("Enter a number");//20, 30, -5, 100, 200
              int num = input.nextInt();

              if (num < min) { // if the user entered entry is less than the current minimum number that we have
                  min = num; //then user entered number should be the minimum number
              }

          }
        System.out.println("Minimum number is: " + min);
    }
}
