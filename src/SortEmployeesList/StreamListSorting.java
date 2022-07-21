package SortEmployeesList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
//    private static int n;
//    private int n,id,salary;
//    private String name;
    public static void main(String[] args) {

//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter value of n of Employees: ");
//        n = Integer.parseInt(myObj.nextLine());
//

        // sort employee by salary in ascending order
        List< Employee > employees = new ArrayList< Employee >();

//        for(int i=0;i<n;i++){
//
//        }
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "John", 29, 350000));
        employees.add(new Employee(30, "Tom", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

//        List < Employee > employeesSortedList1 = employees.stream()
//                .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
//        System.out.println(employeesSortedList1);

        List < Employee > employeesSortedList2 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getId)).collect(Collectors.toList()); //ascending order
        System.out.println(employeesSortedList2);
    }
}
