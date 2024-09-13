package day32_FinalKeyWord.methodOverriding;

public class BMW extends Car{

    public BMW(String make, String mode, String color, int year, double price) {
        super(mode, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanic or jump start " +getMake()+"" +getMode());
    }

}
