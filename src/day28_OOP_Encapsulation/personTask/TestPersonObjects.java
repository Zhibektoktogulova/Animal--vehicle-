package day28_OOP_Encapsulation.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Mohammad");
        Person person2 = new Person("Mary", 'M');
        Person person3 = new Person("John", 33);
        Person person4 = new Person("Jenifer", "English");
        Person person5 = new Person("James", 33, 'M');
        Person person6 = new Person("Jerry", 33, 'M', "English");

        person4.name = "James";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);


        Person.printPlanetName();
        person1.eat("Cheese");

        person2.drink("Water");
        person5.drink("tae");
        person6.drink("Coffee");




    }
}
