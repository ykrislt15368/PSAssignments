import java.util.Scanner;

public class fibonacci {
    private int n;

    public  void fibonacciWrite() {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter value of n for fibonacci series: ");
        n = Integer.parseInt(myObj.nextLine());
        //System.out.println(n);

        int a = 1;
        int b = 1;

        if(n<=1)
        {
            System.out.println(1);
            return;
        }
        if(n==2)
        {
            System.out.println(1);
            System.out.println(1);
            return;
        }

        System.out.println(1);
        System.out.println(1);
        for(int i=2;i<n;i++)
        {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
        return;
    }

}
