package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.setInfo("Alex", 28,'F', "Java Developer", 97700,"A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Kate", 30,'F', "SDET", 97000,"B13");
        Employee employee3 = new Employee();
        employee3.setInfo("Laura", 34,'F', "Front-end Developer", 67000,"A11");

        //If we need to change the name or age of the object

        employee1.age = 39;
        employee2.name = "Zhibek";

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();

    }
}
