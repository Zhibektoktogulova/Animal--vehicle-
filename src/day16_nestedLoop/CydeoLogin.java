package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = input.nextLine();

        System.out.println("Enter your password: ");
        String password = input.nextLine();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("You have successfully logged in!");

        }else{
            for (int i = 0; i < 3; i++) {
                if(i !=2){
                    System.err.println("Incorrect username or password, please try again");
                }else{
                    System.out.println("This is your last chance, Please try again");
                }
                System.err.println("Incorrect username or password, please try again!");
                System.out.println("Enter your username: ");
                input.nextLine();

                System.out.println("Enter your password: ");
                password = input.next();

                if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
                    System.err.println("You have successfully logged in!");
                    break;

                }
            }
            input.close();


        }

        }
    }

