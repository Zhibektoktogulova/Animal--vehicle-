package day03_variables;

import java.sql.SQLOutput;

public class DataTypesIntro2 {

    public static void main(String[] args) {

        // Data Type variables = Data;

        char a = 'a';
        char b = '!'; // char except only single characters

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------");

         char h1 = 'A';
         char h2 = 65;

        System.out.println(h2);
        System.out.println(h1);

        System.out.println("----------------------------");

        char h3 = 40000;

        System.out.println(h3);

        int sum = 'A' + 'B';
               //  65   66  = 131
        System.out.println(sum);

        System.out.println("-----------------------------------");
        // Boolean used for true or false
        boolean r1 = true;
        boolean r2 = false;

        boolean r3 = 100 > 10; // true
        boolean r4 = 0 < -1; // false

        System.out.println(r3);
        System.out.println(r4);






    }
}
