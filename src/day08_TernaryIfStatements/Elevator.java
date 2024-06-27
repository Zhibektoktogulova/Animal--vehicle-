package day08_TernaryIfStatements;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber = 10;


        if (floorNumber > 1 && floorNumber <= 3) {
            if (floorNumber == 1) {
                System.out.println("Lobby, Verizon, Starbucks " + floorNumber);
            } else if(floorNumber == 2) {
            System.out.println("Cydeo, NASA, Intelsat " + floorNumber);
        } else {
                System.out.println("Lyft, BofA, Stake house");
            }
        }else{
            System.out.println("Invalid floor");
        }

        System.out.println("===============================================");

        int floorNumber1 = 2;
        String result = "Invalid floor";
        if (floorNumber1 > 1 && floorNumber1 <= 3) {

         result = "Floor " +floorNumber1+" is selected Companies ";

            if (floorNumber1 == 1) {
                result += "Lobby, Verizon, Starbucks ";
            } else if(floorNumber1 == 2) {
                result += "Cydeo, NASA, Intelsat ";
            } else {
                result += "Lyft, BofA, Stake house";
            }
            }
        System.out.println(result);





    }
}
/*
1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			anything else: print "Invalid floor - 6"
 */