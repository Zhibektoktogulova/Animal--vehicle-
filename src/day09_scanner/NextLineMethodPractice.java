package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine(); //Zh

        System.out.println("Enter your school name:");
        String school_name = input.nextLine(); //LACCD


        System.out.println("Enter your gender:");//Gender
        String gender = input.next(); // Male

        System.out.println("Enter your age:");
        int age = input.nextInt(); // 28

        input.nextLine();// We have to give extra next line method
        System.out.println("Enter your street name");
        String street_name = input.nextLine();






    }
}
