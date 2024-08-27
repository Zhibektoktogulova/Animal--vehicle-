package day31_inheritance_overriding.animal_methodOverridding;

public class Dog extends Animal {

    //constructor method
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    @Override
    public void eat(){
        System.out.println("Dog" + getName() + " is eating dog food");
    }
    @Override
    public void sleep(){
        System.out.println("Dog" + getName() + " sleep 8 hours");
    }

}
