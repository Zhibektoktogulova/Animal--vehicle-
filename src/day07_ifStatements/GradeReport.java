package day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;

        String result = "";

        if (score >= 90) { // False: score < 90
            result = "Your grade is: A";
        }else if (score >= 80 && score < 90){
            result = "Your grade is: B";
        }else if (score >= 70 && score < 80){
            result = "Your grade is: C";
        }else if (score >= 60 && score < 70){
            result = "Your grade is: D";

        }else{
            result = "Your grade is: F";
        }
       System.out.println("Your grade is " + result);


    }
}
