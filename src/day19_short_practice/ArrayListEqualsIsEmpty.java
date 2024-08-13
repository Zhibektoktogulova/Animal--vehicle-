package day19_short_practice;

import java.util.ArrayList;

public class ArrayListEqualsIsEmpty {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Java");
        list1.add("Python");
        list1.add("C#");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("PHP");
        list2.add("C++");
        list2.add("JavaScript");

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        System.out.println( list1 == list2);

        System.out.println( list1.equals(list2));

        System.out.println( list1.isEmpty());
        list2.clear();
        System.out.println(list2.isEmpty());


    }
}
