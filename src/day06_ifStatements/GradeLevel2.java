package day06_ifStatements;

public class GradeLevel2 {

    public static void main(String[] args) {

        int gradeLevel2 = 5;

        String result = ""; // just temporary value

        if (gradeLevel2 >= 1 && gradeLevel2 <= 5){
             result = "Elementary School";
        }
        if (gradeLevel2 >= 6 && gradeLevel2 <= 10){
            result = "Middle School";
        }
        if (gradeLevel2 >= 7 && gradeLevel2 <= 12){
            result = "High School";
        }
        if (gradeLevel2 >= 8 && gradeLevel2 <= 14){
            result = "College";
        }
        if (gradeLevel2 >= 15 && gradeLevel2 <= 17){
            result = "Grade School";
        }
        System.out.println(result);

    }

    }

