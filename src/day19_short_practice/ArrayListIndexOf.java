package day19_short_practice;

import java.util.ArrayList;

public class ArrayListIndexOf {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Javaa");
        list.add("Python");
        list.add("C#");
        list.add("C++");
        list.add("C");
        list.add("Java");
        list.add("Ruby");

        int index1 = list.indexOf("Java");
        System.out.println(index1);

        int index2 = list.indexOf("Python");
        System.out.println(index2);

    }
}
