package day08_TernaryIfStatements;

public class TernariesIntroTo {
    public static void main(String[] args) {

        int number = 100;
       /* String result = "";









       if (number > 0){
           result = "Positive";
       }else if (number < 0){
           result = "Negative";
       }else{
           result = "Zero";
       }
        System.out.println(result);

 */

        String result = (number > 0) ? "Positive" :(number < 0)? "Negative" : "Zero";
        System.out.println(result);

        System.out.println("--------------------------------------------------");


        int n = 1;
        /*
        String day = "";
        if(n == 1) {
            day = "Monday";
        }else if(n == 2) {
            day = "Tuesday";

        }else if(n == 3) {
            day = "Wednesday";
        }else if(n == 4) {
            day = "Thursday";
        }else if (n == 5){
            day = "Friday";
        }else if (n == 6){
            day = "Saturday";

        }else{
            day = "Sunday";
        }
        System.out.println(day);

 System.out.println(result);
 */

        String day = (n == 1)? "Monday" : (n == 2)? "Tuesday" : (n == 3)? "Wednesday" : (n == 4)?
                "Thursday" : (n == 5)? "Friday" : (n == 6)? "Saturday" : "Sunday";;

        System.out.println(day);


        System.out.println("---------------------------------------------------");

        int num = 10; // 1 to 12

        String month;
        month = (num==1)? "January" : (num==2)? "February" : (num==3)? "March" : (num==4)? "April" :(num==5)?
                "May" : (num==6)? "June" :(num==7)? "July" :(num==8)? "August" :(num==9)? "September" :(num==10)?
                "October" : (num==11)? "November" :  "December";
        System.out.println(month);


    }
}
