package day19_short_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveIf {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
