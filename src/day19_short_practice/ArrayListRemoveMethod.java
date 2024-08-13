package day19_short_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list.remove(Arrays.asList(10,9));

        System.out.println(list);


    }
}
