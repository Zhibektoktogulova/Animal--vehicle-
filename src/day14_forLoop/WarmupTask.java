package day14_forLoop;

public class WarmupTask {
    public static String combine(String str1, String str2){

        String str3 = combine("one", "eight");
        System.out.println(str3);



        String result;

        if(str1.endsWith("" + str2.charAt(0) )){
            result = str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }

            return result;
    }
}
