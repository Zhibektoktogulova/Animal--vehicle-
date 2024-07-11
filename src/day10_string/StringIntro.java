package day10_string;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str ="Java";

        System.out.println();
        input.close();

        System.out.println("-----------------------");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Fish";
        String s4 = "Bird";

        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);

        System.out.println("------------------------------");

        String str1 = new String("Java"); // Creates two objects : 1 String pool , 2 in heap (outside string)
        String str2 = new String("Java");
        System.out.println(str1 == str2);

        System.out.println("------------------------------");
        String str3 = "Python";
        String str4 = new String("Python");
        String str5 = new String("Python");
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);










    }
}
