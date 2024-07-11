package day15_whileLoop;

import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int max = -12233444;
        int min = 122324444;
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

        }
        System.out.println("Maximum number is: " + max);
        input.close();

    }
}
