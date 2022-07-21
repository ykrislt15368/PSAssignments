package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeWithA {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

       // list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        AtomicInteger cnt= new AtomicInteger();
        list.forEach(n -> {
            if (n.charAt(0) == 'a') System.out.println(n);
            else {
                cnt.getAndIncrement();
            }
        });

        if(cnt.get() == list.size()) System.out.println(" No one  starting with 'A'");
        else  System.out.println(cnt + " People not starting with 'A' of "+ list.size());

    }
}
