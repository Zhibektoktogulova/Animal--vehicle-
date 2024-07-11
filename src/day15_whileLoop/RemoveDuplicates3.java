package day15_whileLoop;

public class RemoveDuplicates3 {
    public static void main(String[] args) {


       for (int i = 50; i < 101; i++){
           if(i % 2 == 0){
               System.out.print(i + " ");
           }
       }
        System.out.println();

        //50, 52,  54,56,..100
        for (int i = 50; i < 101; i += 2) {
            System.out.print(i+ " ");
        }
        System.out.println();

        for (int i = 50; i < 101; i++) {
            if(i % 2 != 0) { //if the i's value is odd number
                continue;
            }
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
