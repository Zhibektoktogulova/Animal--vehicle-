package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 100;
        int b = 1000;
        System.out.println( a > b); // b is greater than a
        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);

        System.out.println("------------------------------");

        int score = 75;
        boolean passed = score >= 60;
        System.out.println(passed);

        System.out.println("-----------------------------");

        int age = 21;

        boolean eligibleToBuyAlcohol  = age >= 21;

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToSellAlcohol  = age >= 18;

        System.out.println(eligibleToSellAlcohol);

        System.out.println("------------------------------");

        System.out.println( 100 > 100 ); // false
        System.out.println( 100 >= 100 ); // true
        System.out.println(100 >= 185); // false

        System.out.println("-----------------------------");
        score = 48;
        boolean failed = score < 60;
        System.out.println(failed);

        System.out.println("-----------------------------");

        System.out.println(100 < 2000);// true
        System.out.println(100 < 20); // false

        System.out.println("-----------------------------");

        System.out.println( 95 <= 100); // true
        System.out.println( 100 <= 100);// true
        System.out.println(10 <= 5); //false
        System.out.println("----------------------------");
        System.out.println('a' >= 'b');
        //System.out.println("Java" <= "C#"); // Can only applicable for numbers


    }
}
