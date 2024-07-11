package day14_forLoop;

import org.w3c.dom.ls.LSOutput;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 10; i >= 5; i--) {
            System.out.println("Hello Cydeo");

        }

        System.out.println("-----------------------------------");
        //sum of all the numbers 1 to 100

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;

        }
        System.out.println(sum);
        System.out.println("------------------------------");
        //sum of all the alphabet letter A to Z

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

        System.out.println("------------------------------------");
        //print all the alphabet letters in backwards Z -- A

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i +" \n");
        }
        System.out.println();
        System.out.print("Cydeo");

    }

}

