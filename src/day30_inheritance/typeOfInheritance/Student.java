package day30_inheritance.typeOfInheritance;

import java.time.LocalDate;

public class Student extends Person {



    private char grade;
    private String studentId;

    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB);
        setGrade(grade);    //we will use set
        setStudentId(studentId);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study(){
        System.out.println(getName() + " is studying");

    }
}
