package day19_short_practice;

import java.util.ArrayList;

public class ArrayListLoopingInIndexNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //forr
        for (int i =  list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
