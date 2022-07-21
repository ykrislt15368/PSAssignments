package EmployeeConcurrent;

public class Employe {
    private String name;
    private int age;
    private long salary;
    public Employe(String name, int age, long salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public long getSalary() {
        return salary;
    }

}
