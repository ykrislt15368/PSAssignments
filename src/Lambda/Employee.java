package Lambda;

public class Employee {
    private int EmpNo;
    private String name;
    private int age;
    private int salary;

    public Employee(int EmpNo,String name,int age, int salary){
        this.EmpNo=EmpNo;
        this.name=name;
        this.age=age;
        this.salary = salary;
    }
    public int getEmpNo() {
        return EmpNo;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }


}
