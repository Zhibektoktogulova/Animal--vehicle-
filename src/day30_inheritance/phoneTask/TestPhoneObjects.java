package day30_inheritance.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {

        iPhone iPhone = new iPhone("iPhone 12","Large", "Black", 1000.6);
        Samsung samsung = new Samsung("Galaxy S22","Medium", "White", 1100);
        Nokia nokia = new Nokia("Brick", "Small", "Pink", 120);

       iPhone.call(911);
       samsung.call(912);
       nokia.call(913);

       iPhone.text(79800-914);
       samsung.text(7980-914);
       nokia.text(7980-914);

        System.out.println("----------------------------------------");

        iPhone.faceTime(122324344);

        samsung.freeze();

        nokia.selfDefence();

        System.out.println("----------------------------------------");

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);
    }
}
