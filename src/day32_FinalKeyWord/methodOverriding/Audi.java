package day32_FinalKeyWord.methodOverriding;

public class Audi  extends  Car{

    
    public Audi(String make, String mode, String color, int year, double price) {
        super(mode, color, year, price);
    }
    @Override
    public void start(){
        System.out.println("Press the start button to start "+getMake()+" "+getMode());
    }
}
