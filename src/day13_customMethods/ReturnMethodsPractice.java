package day13_customMethods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(100));
        int num = 200;
        if (isOdd(num)) {
            System.out.println(num +"is even number");
        }else{
            System.out.println(num);
        }



    }

    public static boolean isOdd(int num) {
        //return(num % 2 != 0)? true : false;
        if(num %2 !=0){
            return true;
        }
       return false;
    }
    public static boolean isEven(int num) {
        return !isOdd(num);
        //return (num % 2 == 0)? true : false;

    }
    public static int max(int n1,int n2) {
        if(n1 > n2){
            return n1;
        }else{
            return n2;
        }


    }


    }

