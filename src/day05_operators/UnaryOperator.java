package day05_operators;

public class UnaryOperator {

    public static void main(String[] args) {

        //pre increment / decrement

        int x = 10;

        System.out.println(++x); //11
        System.out.println(x); //11

        int y = 100;

        System.out.println(--y); // 99
        System.out.println(y); //99

        System.out.println("---------------------------------------");

        int z = 50;

        System.out.println(z++);   // 50
        System.out.println(z--);

        int b = 25;

        System.out.println(b--);    //25
        System.out.println(b);  // 24

        System.out.println("-------------------------");

        int n = 30;

        int m = n++; // m = 30

        System.out.println("n = " + n);

        System.out.println("m = " + m);

        int e = 60;

        int q = e--;     //  q = 60; e = 59;
        System.out.println("e = " + e);
        System.out.println("q = " + q);



    }
}
