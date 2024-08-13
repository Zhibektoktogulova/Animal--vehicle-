package day19_short_practice;

import java.util.ArrayList;

public class ArrayListSetMethod {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");


        System.out.println(list);

       list.set(2, String.valueOf(300));

        System.out.println(list);


    }
}
