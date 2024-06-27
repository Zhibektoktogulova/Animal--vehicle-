package day04_concatenation;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {


        // ---------Implicit Casting--------

        byte a =15;

        short b =(short)a;
        // short b = (short)a

        System.out.println(b);

        int c = a; //implicit casting
        long d = 3000L;

        float e = d; // Implicit casting
        double f = d;


        //-----------Explicit Casting---------



        int g = 100;

        byte h = (byte)g;

        float i = 20.8F;
        double z = i;
        System.out.println(i);

        double n1 = 2.5;
        byte n2 = (byte)n1; // n1 = 2.5;
        System.out.println(n2);

        System.out.println("-------------------------------------");
        int num = 500;
        byte result = (byte)num; // explicit casting
        System.out.println(result);

        int r = 50000;

        short s = (short)r;
        System.out.println(s);

        System.out.println("-------------------------------------");

        double u = 3000.5;
        int v = (int)u; // explicit Casting
        System.out.println(v);

        int o = 100;
        double d1 = o;

        System.out.println(d1);









    }
}
