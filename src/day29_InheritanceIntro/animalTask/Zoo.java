package day29_InheritanceIntro.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'F',4,"Large", "White");


        Cat cat = new Cat();
        cat.setInfo("Felicia", "Stray", 'F', 3, "Medium", "Black");

        Tiger tiger = new Tiger();
        tiger.setInfo("Rex","Bengal", 'M', 4,"Medium", "Brown");


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("===================================================");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        System.out.println("===================================================");

        dog.bark();

        cat.meow();

        tiger.hunt();

        System.out.println("===================================================");

        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.gender = 'K';
        dog.age = 3;

    }
}
