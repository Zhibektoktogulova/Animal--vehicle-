package day14_forLoop;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));

        System.out.println(sum(1.5, 2.5, 3.5, 4.5));
        System.out.println(sum(1.5, 2.5, 3.5, 4.5));
        System.out.println(sum(1.5, 2.5, 3.5, 4.5, 5.5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;




    }
    public static double sum(double a, double b, double c, double d) {
        return a + b + c + d;
    }
    public static double sum(double a, double b, double c, double d, double e) {
        return a + b + c + d + e;
    }
    public static double sum(double a, double b, double c, double d, double e, double f) {
        return a + b + c + d + e + f;
    }
}
