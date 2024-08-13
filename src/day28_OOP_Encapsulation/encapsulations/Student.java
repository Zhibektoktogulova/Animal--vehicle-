package day28_OOP_Encapsulation.encapsulations;

public class Student {

    private String name;
     private int age;


    public String getName() {
        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false, hasSpecialChar = false;
        for (char each : name.toCharArray()){
            if (Character.isDigit(each)){
                hasDigit = true;
                break;
            }

            }
        if(hasDigit){
            System.out.println("Invalid name:"+name);
            System.exit(1);

        }
        this.name = name;
    }

    public int getAge() { // read only
         return age;
     }

     public void setAge(int age) {//Write only
         if (age < 1 || age > 100) {
             System.err.println("Invalid age:" +age);
             System.exit(1); // program gets terminated
         }
         this.age = age;
     }

}
