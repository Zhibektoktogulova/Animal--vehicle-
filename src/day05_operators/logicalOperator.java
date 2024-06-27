package day05_operators;

import java.sql.SQLOutput;

public class logicalOperator {


    public static void main(String[] args) {


        double salary = 60000;
        int credScore = 650;
        int age = 42;
        boolean eligibleForLoan = salary >= 30000 && credScore >= 650 && age >= 18;

        System.out.println(eligibleForLoan); // true

        System.out.println("--------------------------------");

        age = 18;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country.equals("USA");
        System.out.println(eligibleToVote);    // true

        System.out.println("---------------------");

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);

        System.out.println("--------------------------------");

        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passedTheExam);

        System.out.println("---------------------------------");

        System.out.println(!true);
        String a = "yes";
        boolean yes = a == "yes"; // true
        boolean no = !yes;  // false
        System.out.println("yes =" + yes);
        System.out.println("no =" + no);

        System.out.println("----------------------------------");

        int score = 65;

        boolean passed  = score >= 60;
        boolean failed = !passed;

        System.out.println("passed =" + passed);    // true
        System.out.println("failed =" + failed);    // false

        System.out.println("-----------------------------");
        System.out.println(true == !false  && false == !true && true != !true);
        //                       true       &&     true       &&   true





    }
}
