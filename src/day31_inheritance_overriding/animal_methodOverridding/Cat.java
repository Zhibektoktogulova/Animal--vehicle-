package day31_inheritance_overriding.animal_methodOverridding;

public class Cat extends Animal {

    //constructor method
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println("Cat" +getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat" +getName() + " sleeps 12  hours in  a day");
    }
}
