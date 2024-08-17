package day17_customClass;

import org.w3c.dom.ls.LSOutput;

public class TestDogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 1;
        dog1.size = "Large";
        dog1.color = "White";

      Dog dog2 = new Dog();
      dog2.name = "Alex";
      dog2.breed = "German Shepherd";
      dog2.gender = 'F';
      dog2.age = 3;
      dog2.size = "Small";
      dog2.color = "Black";

     Dog dog3 = new Dog();
     dog3.setInfo("Loki","Chow Chow","Medium",'F',3,"white");

     Dog dog4 = new Dog();
     dog4.setInfo("Chuck", "Pug","Small",'F',4,"black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
    }

}
