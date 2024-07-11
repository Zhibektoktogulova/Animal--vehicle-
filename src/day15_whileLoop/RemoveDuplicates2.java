package day15_whileLoop;

import org.w3c.dom.ls.LSOutput;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str = "amskdfkblf";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(result.contains(String.valueOf(str.charAt(i)))) { //if the characters is already contained in new string
                continue; // skip it
            }
            result += str.charAt(i);

        }
        System.out.println(result);

          }
    }



