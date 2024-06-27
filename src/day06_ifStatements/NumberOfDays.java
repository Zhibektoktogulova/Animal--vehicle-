package day06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {
        int number = 10;

        boolean has28Days = number ==  2 ; //if the month number is 2 (Feb), then it has 28 days
        boolean has30Days = number == 4 || number == 6  || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;
         // if the month does not have 30 days and also does not have 30 days, then the month has 31 days
        String result = "";

        if(has28Days){
            result = "28 days";
        }
        if(has30Days){
           result = "30 days";
        }
        if(has31Days){
            result="31 days";

        }

        System.out.println(result);
    }
}
