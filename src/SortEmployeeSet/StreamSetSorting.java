package SortEmployeeSet;

import SortEmployeesList.Employee;

import java.util.*;

class myIdComparator implements Comparator<SortEmployeesList.Employee>
{

    public int compare(Employee e1, Employee e2)
    {
        return e1.getName().compareTo(e2.getName());
    }
}

public class StreamSetSorting {

    public static void main(String[] args) {

        TreeSet<SortEmployeesList.Employee> employees = new TreeSet<SortEmployeesList.Employee>(new myIdComparator());
        employees.add(new SortEmployeesList.Employee(10, "Ramesh", 30, 400000));
        employees.add(new SortEmployeesList.Employee(20, "John", 29, 350000));
        employees.add(new SortEmployeesList.Employee(30, "Tom", 30, 450000));
        employees.add(new SortEmployeesList.Employee(40, "Pramod", 29, 500000));


//        List < Employee > employeesSortedList2 = employees.stream()
//                .sorted(Comparator.comparingLong(Employee::getId)).collect(Collectors.toList()); //ascending order
        System.out.println(employees);
    }
}






