package day32_FinalKeyWord.methodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car {

    public Tesla( String model, String color, int year, double price) {
        super( model, color, year, price);
    }

    public void autoPilot(){
        System.out.println(getMake()+"" + getMode()+" is in self-driving mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " +getMake()+"" + getMode());
    }

    @Override
    public void setMode(String model) {
        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Mode S", "Model Y", "Model x", "Model 3"));

        if(model.contains(model)){
            System.err.println("Invalid Tesla Model: "+model);
            System.exit(1);
        }
        super.setMode(model);
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Gray"));

        if(color.contains(color)){
            System.err.println("Invalid Tesla Color:"+color);
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if(year < 2008){
            System.err.println("Invalid year of Tesla car:"+year);
        }

        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {

        if(price < 50000){
            System.err.println("Invalid price for Tesla car:"+price);
            System.exit(1);
        }

        super.setPrice(price);
    }


}
