package day19_short_practice;

import java.util.ArrayList;

public class ArraylistSizeGetMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Cydeo");
        list.add("Java");
        list.add("SDET");
        list.add(1,"Python");

        //size method
        int totalElements = list.size();
        System.out.println("Total elements in list: " + totalElements);

        //get method
        String thirdElements = list.get(2);
        System.out.println("Third elements in list: " + thirdElements);




    }
}
