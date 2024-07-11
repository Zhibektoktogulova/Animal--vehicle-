package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                System.out.println("Hello " + i);
            }
            System.out.println("--------------------------");

            for (int j = 0; j <= 5; j++) {
                System.out.println("Hello " + j);
            }
            System.out.println("--------------------------");
            int j = 0;
            while (j < 5) {
                System.out.println("Hello " + j);
                j++;

            }
            System.out.println("---------------------------");
            int k = 0;
            do{
                System.out.println("Hello " + k);
                k++;
            }while (k < 5);
            System.out.println("---------------------------");
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your grade");
            int score = input.nextInt();

            while(score < 100 || score > 0){
                System.out.println("Invalid score, please try again");
                score = input.nextInt();
            }

            if (score >= 90) {
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }
    }
}
