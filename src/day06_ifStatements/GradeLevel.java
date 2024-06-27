package day06_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {


        int gradeLevel = 5;
        if (gradeLevel >= 1 && gradeLevel <= 5){
            System.out.println("Elementary School");
        }
         if (gradeLevel >= 6 && gradeLevel <= 10){
             System.out.println("Middle School");
         }
         if (gradeLevel >= 7 && gradeLevel <= 12){
             System.out.println("High School");
         }
         if (gradeLevel >= 8 && gradeLevel <= 14){
             System.out.println("College");
         }
         if (gradeLevel >= 15 && gradeLevel <= 17){
             System.out.println("Grade School");
         }
        }

    }



