package day19_short_practice;

import java.util.ArrayList;

public class ArrayListForEachLoop {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("PHP");


        for (String each : list) {
            System.out.println(each);
        }
    }
}
