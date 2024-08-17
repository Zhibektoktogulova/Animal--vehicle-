package day30_inheritance.typeOfInheritance;


import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {


        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5,16),'A', "A01");
        President president = new President("Daniel", 'M',LocalDate.of(1980, 12,1), LocalDate.of(2020,1,1));
        Teacher teacher = new Teacher("Zara", 'F', LocalDate.of(1990, 11,1),"Math Teacher","C1",95000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();
        System.out.println("----------------------------------------");
        student.study();

    }
}
