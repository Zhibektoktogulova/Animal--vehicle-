package day19_short_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAddAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(8);

        list2.addAll( 1, list1);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1, 2,3,4,5));
        System.out.println(list3);


    }
}
