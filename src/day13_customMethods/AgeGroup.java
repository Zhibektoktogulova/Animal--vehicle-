package day13_customMethods;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

     ageGroup(28);

    }

    public static void ageGroup(int age) {
        if (age >= 0 && age <= 150) {
            System.out.println((age <= 21)? "Teenager" :(age < 55)? "Adult" : "Senior");
        }else{
            System.out.println("Invalid Age" +age);
        }
    }
}
