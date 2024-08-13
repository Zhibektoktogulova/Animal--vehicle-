package day19_array;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Jeniffer";
        myGroup[myGroup.length-1] = "Software";
        myGroup[2] = "Tom";
        myGroup[1] = "Sam";
        myGroup[3] = "Chelsey";
        System.out.println(Arrays.toString(myGroup));

        myGroup[4] = "Sandra";
        myGroup[5] = "Jessy";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("------------------------------");

        for (int i = myGroup.length-1; i >= 0; i++) {
            System.out.println(myGroup[i]);
        }
        System.out.println("------------------------------------");
        for (int i = myGroup.length-1; i >= 0; i--) {

        }
    }
}
