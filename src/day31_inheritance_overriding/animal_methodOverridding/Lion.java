package day31_inheritance_overriding.animal_methodOverridding;

public class Lion extends Animal {

    private boolean isAfricanLion;

    //constructor method


    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    public void eat() {
        System.out.println("Lion" +getName() + " is eating deer");
    }
    public void sleep(){
        System.out.println("Lion" +getName() + " sleeps 8 hours");
    }

    public void roar() {
        System.out.println("Lion" +getName() + " is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", African lion='"+isAfricanLion +'\''+
                '}';
    }
}
