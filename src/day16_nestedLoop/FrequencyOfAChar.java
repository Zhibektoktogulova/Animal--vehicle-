package day16_nestedLoop;

public class FrequencyOfAChar {
    public static void main(String[] args) {

        String str = "abbcdkffsgfhj";

        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i index number of str
            if (str.charAt(i) == ch) { //if the character of the string the given character
                count++;

            }

        }
        System.out.println(count);
    }
}
