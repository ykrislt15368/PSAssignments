import java.util.Scanner;

public class factorial {
    private int n;

    public void factWrite()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of n for factorial: ");
        n = Integer.parseInt(myObj.nextLine());
        //System.out.println(n);
        int k=1;
        for(int i=1;i<=n;i++)
        {
            k=k*i;
            System.out.println(k);
        }
        return;
    }
}
