package day08_TernaryIfStatements;

public class TernariesIntro {
    public static void main(String[] args) {

        int score = 85;
        String result = "";

        if (score >= 60) {
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(result);

        System.out.println("----------------------------------------------");

        String result2 = (score >= 60) ? "Passed" :  "Failed";
        System.out.println(result2);

        System.out.println("----------------------------------------------");

        int age = 34;
        String r ="";

        if (age >= 21) {
            r = "Eligible";
        }else{
            r = "Not Eligible";
        }
        System.out.println(r);
        System.out.println("-----------------------------------------------");
        int age2 = 35;

        String result3 = (score >= 21) ? "Eligible" :  "Not Eligible";

        System.out.println(result3);



    }
}
/*
single if: for one condition

	if(Condition1){
		StatementA
	}

	StatementA: Condition1 is true


If & Else: for TWO condition ONLY

	if(Condition1){
		StatementA
	}else{
		StatementB
	}


	StatementA: Condition1 is true
	StatementB: Condition1 is false


		Yes or No
		Pass or Failed
		Odd or Even
		Eligible or not eligible
		employee or not employee
		fullTime or partTime
		...

 */