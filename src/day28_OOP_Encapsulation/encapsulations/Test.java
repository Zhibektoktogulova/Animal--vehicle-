package day28_OOP_Encapsulation.encapsulations;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        //student.age = -100;

        student.setAge(20);
        System.out.println(student.getAge());


        student.setName("Aaron");
        System.out.println(student.getName());



    }
}
