package day07_ifStatements;

import java.sql.PreparedStatement;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel = 10;

        String result = "";

        if (gradeLevel <= 5) {
            result = "Elementary School";
        }else if (gradeLevel <= 8) {
            result = "Middle School";

        }else if (gradeLevel <= 12) {
            result = "High School";
        }else if (gradeLevel <= 16) {
            result = "College";
        }else{
            result = "Grade School";
        }

        System.out.println(result);



    }
}
