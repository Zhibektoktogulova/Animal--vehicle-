package day17_customClass;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "abcccdbjklkkkgfftguiiopjiiyttrdrsrsrtjhjh";
        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //a
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;


                }

            }
            if (result.contains(""+ch)) { //if the character is already included in the result
                continue; //skip that character
            }
            result += ch + "" + count;

        }
        System.out.println(result);

    }
}
