package day19_array;

public class MinNumbers {

    public static void main(String[] args) {

        
        int[] numbers = {100,200,500, 40,-10,30,50};

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > min){
                min = numbers[i];
            }

        }
        System.out.println("max = " + min);





    }
}
