package day07_ifStatements;

import java.sql.SQLOutput;

public class Grade {

    public static void main(String[] args) {


        char grade = 'B';

        String result = "";

        if(grade == 'A'){
            result = "Excellence";
        }
        if(grade == 'B'){
            result = "Great job";
        }
        if(grade == 'C'){
            result = "Good";
        }
          if(grade == 'D'){
              result = "Passed";
          }
        if(grade == 'F'){
            result = "Failed";
        }
        System.out.println(result);
    }
}
