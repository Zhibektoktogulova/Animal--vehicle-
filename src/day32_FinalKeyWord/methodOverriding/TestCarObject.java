package day32_FinalKeyWord.methodOverriding;

public class TestCarObject {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("qwe", "Toyota", "Blue", 2020, 25000);
        Honda honda = new Honda("Ac", "Accord", "Blue", 2019, 35000);
        Audi audi = new Audi("qwe", "Q6", "Black", 2023, 45000);
        BMW bmw = new BMW("qwe", "X6", "White", 2024, 75000);
        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("===================================================================");
        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();


        System.out.println("================================================");

        tesla.setMode("Model H");
    }
}
