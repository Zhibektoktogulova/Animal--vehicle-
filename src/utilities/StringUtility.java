package utilities;

public class StringUtility {

    public static String reverse(String str) {
        String reversed = ""; // to contains all the characters of the given string in reversed order

        for (int i = str.length() - 1; i >= 0; i--) { // i: index number of  the given string starting from last index to index 0
            reversed += str.charAt(i);// to get each character of the string from last index zero
        }
        return reversed;
    }
}
