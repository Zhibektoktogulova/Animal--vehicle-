package day04_concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Aaron Kissinger";
        String  buildingNumber = "12321A";
        String  streetName = "Legacy Circly";
        String  city = "Fairfax";
        String   state = "VA";
        String  zipCode = "22030";

        System.out.println("Your shipping address is: ");
        System.out.println("\t" + name);
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t" + city + ", " + zipCode);

        System.out.println("-----------------------");

        System.out.println("Your shipping address is:\n\t" + name + "\n\t" + buildingNumber +
                "\n\t" + streetName + "\n\t" + city + ", " + zipCode);








    }
}
