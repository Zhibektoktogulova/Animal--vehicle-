package day19_short_practice;

import java.util.ArrayList;

public class ArrayListRemoveClearMethod {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C++");
        list.add("C");
        list.add("Java");
        list.add("Ruby");

        System.out.println(list);

       // list.remove("Java");
        list.remove("Java");
        System.out.println(list);

        list.clear();
        System.out.println(list);


    }
}
