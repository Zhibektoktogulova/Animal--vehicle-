package day16_nestedLoop;

import javax.swing.plaf.IconUIResource;

public class NestedLoopPractice {
    public static void main(String[] args) {

        String str = "ambmvsddm";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for(int i = 1; i < str.length(); i++){
                if(str.charAt(i) == ch){
                    count++;

        }

            }
            if(count == 2 && !result.contains("" +ch)){
                result += ch;
            }
        }
        System.out.println(result);

    }
}
