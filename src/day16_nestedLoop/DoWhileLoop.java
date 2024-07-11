package day16_nestedLoop;

import java.sql.SQLOutput;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;
        for(; condition; ) {
            System.out.println("Hello World");
        }
        System.out.println("-----------------------------");
        while(condition) {
            System.out.println("Hello World");
        }
        System.out.println("-----------------------------");
        do{
            System.out.println("Hello World");
        }while(condition);
    }
}
