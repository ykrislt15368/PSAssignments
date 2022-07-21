package EmployeeConcurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo {


    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Employe> m
                = new ConcurrentHashMap<>();
        m.put(1,new Employe( "Ramesh", 30, 400000));
        m.put(2,new Employe( "John", 29, 350000));
        m.put(3,new Employe( "Tom", 30, 450000));
        m.put(4,new Employe("Pramod", 29, 500000));

        System.out.println(m);
    }
}
