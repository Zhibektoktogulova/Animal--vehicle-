package day19_short_practice;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Javaa");
        list.add("Python");
        list.add("C#");
        list.add("C++");
        list.add("C");
        list.add("Java");
        list.add("Ruby");

        boolean hasJava = list.contains("Python");
        boolean hasSwift = list.contains("Swift");

        System.out.println("hasJava: " + hasJava);
        System.out.println("hasSwift: " + hasSwift);
    }
}
