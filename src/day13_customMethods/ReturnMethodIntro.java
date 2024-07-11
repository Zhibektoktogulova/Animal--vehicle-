package day13_customMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        int total = addition(10,20);

        int t = square(10);
        System.out.println(square(10));

        System.out.println(cube(5));
        int r = cube(5);


    }

    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;

    }

    public static int square(int num) {
        int square = num * num;
        return square;
    }
    public static int cube(int num) {
        int cube = square(num)* num;
        return cube;
    }
}
