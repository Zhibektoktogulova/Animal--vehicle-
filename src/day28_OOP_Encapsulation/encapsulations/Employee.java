package day28_OOP_Encapsulation.encapsulations;

public class Employee {

    private String name;
    private int age;
    private String jobTittle;
    private double salary;


    public Employee(String name, int age, String jobTittle, double salary) {
        setName(name);
        setAge(age);
        setJobTittle(jobTittle);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16) {
            System.err.println("Invalid Age" +age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTittle() {
        return jobTittle;
    }

    public void setJobTittle(String jobTittle) {
        if (jobTittle.isEmpty() || jobTittle.isBlank()) {
            System.err.println("Invalid Job Tittle of the employee cannot be empty or blank");
            System.exit(1);
        }
        this.jobTittle = jobTittle;
    }


    public String getName() {
        if(name == null){
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank())
            System.err.println("Employee name cannot be empty or blank");
           System.exit(1);
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Salary cannot be negative " +salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTittle='" + getJobTittle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
