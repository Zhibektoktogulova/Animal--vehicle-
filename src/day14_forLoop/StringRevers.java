package day14_forLoop;

public class StringRevers {
    public static void main(String[] args) {


        String str = "Zhibek";
        //            0123
          //"avaJ
        String reversed = "";
        for (int i = str.length() -1 ; i >= 0; i--) {
           reversed += str.charAt(i);


        }
        System.out.println(reversed);
        System.out.println("--------------------------------");

      String name = "Zhibek Toktogulova ";
        String result = reverse(name);
        System.out.println(result);
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
