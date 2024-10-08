package day29_InheritanceIntro.animalTask;

public class Animal {
    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public static boolean isAnimal;

     static {
         isAnimal = true;
     }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat() {
         System.out.println(name+ " is eating...");
    }
    public void drink() {
         System.out.println(name+ " is drinking...");
    }
    public void sleep() {
         System.out.println(name+ " is sleeping...");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public void bark(){
         System.out.println(name+ " is barking...");
    }
}
/*
Custom Classes:
	0. Animal

			attributes:
					name, breed, gender, size, color, age

			methods:
				setInfo(), eat(), sleep(), drink(), toString()


	1. Dog
			attributes:


			methods:
					 bark()

	2. Cat
			attributes:


			methods:
				meow(), scratch()

	3. Tiger

			attributes:


			methods:
				hunt()



Object Class:  parent of all the classes ( implicitly inherited)

 */