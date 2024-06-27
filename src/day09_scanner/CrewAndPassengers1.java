package day09_scanner;

public class CrewAndPassengers1 {
    public static void main(String[] args) {

         int number = 50;

         String result = (number == 50 || number == 75 || number == 100) ?

                 (number == 50) ?  "20 crew, 30 passengers"
                :(number == 75) ? "25 crew, 50 passengers"
                :"25 crew, 50 passengers"
               :"Invalid";

        System.out.println(result);

        System.out.println("-----------------------------------------------");

        String result2 = "";
        switch (number) {
            case 50:
                result2 = "20 crew, 30 passengers";
                break;
            case 75:
                result2 = "25 crew, 50 passengers";
                break;
            case 100:
                result2 = "25 crew, 50 passengers";
            default:
                result2 = "Invalid number";




        }

        System.out.println(result2);







    }

}
/*
Warmup tasks:
	1. Create a class named CrewAndPassengers
		Given a number of people on the ship (int number)
		determine how many need to be crew members and how many can be passengers.
		Print how many of each type there should be.

                Total: 50  ====> 20 crew, 30 passengers
                Total: 75  ====> 25 crew, 50 passengers
                Total: 100 ====> 30 crew, 70 passengers
               30 crew, 70 passengers

                Solution1: Use ternary. Do not use more than one println()
                Solution2: Use switch statement. Do not use more than one println()
 */