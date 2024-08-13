package day19_short_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRetainAllMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,25));
        list.retainAll(Arrays.asList(25));
        System.out.println(list);

    }
}
