package day09_scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in); //for reading user input

        System.out.println("Enter a number: ");
       byte num1 =  input.nextByte();



        System.out.println("Your entered: " + num1);

        System.out.println("---------------------------------");
        //nextShort()

        short num2 = input.nextShort();
        System.out.println("Your entered: " + num2);

        System.out.println("----------------------------------");
        //nextInt()
        int num3 = input.nextInt();
        System.out.println("Enter your third number: " + num3);

        System.out.println("----------------------------------");

        long num4 = input.nextLong();
        System.out.println("Enter your fourth number: " + num4);


    }
}
