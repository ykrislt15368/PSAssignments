package SortEmployeeMap;

import SortEmployeesList.Employee;

import java.util.Comparator;
import java.util.TreeMap;

class myIdComparator implements Comparator<Employee> {

    public int compare(SortEmployeesList.Employee e1, Employee e2)
    {
       // return e1.getId()-e2.getId();
        return e1.getName().compareTo(e2.getName());
    }
}

public class StreamMapSorting {

    public static void main(String[] args) {

        TreeMap<SortEmployeesList.Employee,Integer> employees = new TreeMap<SortEmployeesList.Employee,Integer>(new myIdComparator());
        employees.put(new SortEmployeesList.Employee(10, "Ramesh", 30, 400000),2);
        employees.put(new SortEmployeesList.Employee(20, "John", 29, 350000),1);
        employees.put(new SortEmployeesList.Employee(30, "ATom", 30, 450000),3);
        employees.put(new SortEmployeesList.Employee(40, "Pramod", 29, 500000),4);


//        List < Employee > employeesSortedList2 = employees.stream()
//                .sorted(Comparator.comparingLong(Employee::getId)).collect(Collectors.toList()); //ascending order
        System.out.println(employees);
    }
}






