//package EmployeeSort;
//
//import java.util.*;
//
//public class EmployeeUt {
//    EmployeeUt utility = new EmployeeUt();
//    utility.getEmployeeSet();
//    utility.getSortedManagers();
//    utility.getManagerMap();
//    ArrayList<Employee> a1 = new ArrayList<Employee>();
//
//        a1.add(new Employee(10, "Ramesh", 30, 400000));
//        a1.add(new Employee(20, "John", 29, 350000));
//        a1.add(new Employee(30, "Tom", 30, 450000));
//        a1.add(new Employee(40, "Pramod", 29, 500000));
//
//        System.out.println("Sorting by Name in list");
//
//        Collection.sort(a1,new NameComparator());
//        Iterator<Employee> itr = a1.iterator();
//
//        while(itr.hasNext()){
//            Employee st = itr.next();
//            System.out.println(st.getAge()+" "+st.getName()+" "+st.getEmpNo());
//    }
//
//     System.out.println("Sorting by age in list");
//
//        Collection.sort(a1,new AgeComparator());
//    Iterator<Employee> itr2 = a1.iterator();
//
//        while(itr2.hasNext()){
//        Employee st = (Employee)itr2.next();
//        System.out.println(st.getAge()+" "+st.getName()+" "+st.getEmpNo());
//    }
//
//    public Set<Employee> getEmployeeSet(){
//        TreeSet<Employee> t1 = new TreeSet<Employee>(new AgeComparator());
//        t1.add(new Employee(10, "Ramesh", 30, 400000));
//        t1.add(new Employee(20, "John", 29, 350000));
//        t1.add(new Employee(30, "Tom", 30, 450000));
//        t1.add(new Employee(40, "Pramod", 29, 500000));
//
//        Iterator<Employee> itr2 = t1.iterator();
//        System.out.println("Sorting by Age with Treeset");
//
//        while(itr2.hasNext()){
//            Employee st = itr2.next();
//            System.out.println(st.getAge()+" "+st.getName()+" "+st.getEmpNo());
//        }
//        return t1;
//    }
//        public void getManagerMap(){
//
//            TreeMap<Manager,String> t1 = new TreeMap<Manager,String>();
//            t1.add(new Employee(10, "Ramesh", 30, 400000));
//            t1.add(new Employee(20, "John", 29, 350000));
//            t1.add(new Employee(30, "Tom", 30, 450000));
//            t1.add(new Employee(40, "Pramod", 29, 500000));
//
//            t1.put
//        }
//}
