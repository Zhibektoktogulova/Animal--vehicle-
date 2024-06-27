package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // Data type variable name = Data;
        // byte a = " Java"; // byte Only accepts integer values (-128 - 127)
        // byte a = 20.5; // Byte can not take decimal numbers
        // byte a = 2000; // out of Byte range ( -128 to 127)


        byte a = 12;

        //price of the car is $17500
        short b = 17500;
        System.out.println(b);

        int c = 50000;
        System.out.println(c);
        long n = 99999999999L;

        System.out.println(n);

        float d = 3.14f;
        System.out.println(d);






    }
}




/*\
  byt = integer (1bytes) ---128 to 127
  short = integer (2 bytes)---32.768. to 32.767
  int = integer --- (4 bytes)--->2,147.483,648
  long = integer (8 bytes) ---->9,223,372,036,8547,75,808
  float = floating point (4 bytes) -->+3.4028282347 long number end the ned of number add L
  double = floating point (8 bytes) -->1.79769373284490, 33.434
  char = single character (2 bytes) All unicode values from 0 to 65,535
  boolean = false or true
 */
