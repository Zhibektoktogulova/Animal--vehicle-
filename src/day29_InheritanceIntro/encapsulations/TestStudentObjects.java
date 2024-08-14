package day29_InheritanceIntro.encapsulations;

public class TestStudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Mike", 23, 'M', 'A', "MIT");
        System.out.println(student1);

        student1.setSchoolName("Harvard");
        student1.setGrade('B');
        System.out.println(student1);

    }
}
