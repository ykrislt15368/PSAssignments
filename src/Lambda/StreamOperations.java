package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamOperations {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StreamOperations obj = new StreamOperations();
       // obj.streamofoperation();
       // obj.employeeOperations();
       // obj.listStreamOperations();
        obj.collectOperation();
        //obj.filterWithList();


    }

    public void streamofoperation() {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);

        Integer arr[] = new Integer[]{67,89,56,41,34,56};

        List<Integer> mylist =Arrays.asList(arr);

        List<String> nameList = new ArrayList<String>();


        Stream<Integer> strm = mylist.stream();

        long count1  = strm.filter(p-> p%2==0).count();

        System.out.println("Even no "+count1);
        // Stream<Integer> stream11 =
        stream.limit(5).forEach(p -> System.out.println(p));
        // stream11.forEach(p -> System.out.println(p));

        Stream<Integer> streamnew = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        streamnew.forEach(p -> System.out.println(p));
        //   streamnew.forEach(System.out::println);

        Stream<String> streamstr = Stream.of( new String[]{"Aashish","Prashant","Rohit"} );

        //  long count = streamstr.filter(strr->strr.startsWith("A")).count();

        streamstr.forEach(p -> System.out.println(p));



    }


    public void listStreamOperations() {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        List<Employee> empList = new ArrayList<Employee>();
        Employee e1 = new Employee(12343,"Rohit",26,1000);
        Employee e2 = new Employee(12344,"RSupriya",27,2000);
        Employee e3 = new Employee(12345,"Rmanisha",31,4000);
        empList.add(e3);
        empList.add(e2);
        empList.add(e1);

        Stream<Employee> empstream = empList.stream().filter(emp -> emp.getName().startsWith("R"));

        long count = empList.stream().filter(emp -> emp.getAge()>30).count();

        System.out.println("count -"+count);
        empstream.forEach(empobj -> System.out.println(empobj.getName()));

        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));

    }

    public void iterateStream() {
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        randomNumbers.limit(20)
                .forEach(System.out::println);
    }


    public void collectOperation() {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 1)
                .collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }

    public void collectToanArrayOps() {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);

    }

    public void filterWithList() {
        List<String> empList = new ArrayList<>();
        empList.add("Aayush");
        empList.add("Aashish");
        empList.add("Prashant");

        empList.stream().filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);

        empList.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        empList.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //for match operation

        boolean matchedResult = empList.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = empList.stream()
                .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = empList.stream()
                .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        //for count

        long count = empList.stream()
                .filter((s) -> s.startsWith("P"))
                .count();

        System.out.println(count);

        //reduced

        Optional<String> reduced = empList.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

        //find first

        String firstName = empList.stream()
                .filter((s) -> s.startsWith("A"))
                .findFirst()
                .get();

        System.out.println(firstName);
    }

    public void parallelStreamCreation() {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        //Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream();

        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }

    public void employeeOperations() {
        List<Employee> empList = new ArrayList<Employee>();

        Employee emp1 = new Employee(132234,"Akash",27,4000);
        Employee emp2 = new Employee(132235,"Vani",28,5000);
        Employee emp3 = new Employee(132236,"Manisha",24,6000);
        Employee emp4 = new Employee(132237,"Prashant",26,7000);
        Employee emp5 = new Employee(132238,"Adarsh",25,8000);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        Stream<Employee> result = empList.stream();

        List<Employee> resultnew = result.filter(e1 ->e1.getName().startsWith("A")).collect(Collectors.toList());

        long count  = result.filter(e1 ->e1.getName().startsWith("A")).count();

        //	List<Employee> result11 = result.filter(e1 ->e1.getEmpNo()==132234).collect(Collectors.toList());


        resultnew.forEach(System.out::println);

        resultnew.forEach(e1->System.out.println(e1.getName()));


        System.out.print(resultnew);

    }
}
