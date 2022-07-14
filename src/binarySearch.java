import java.util.Scanner;

public class binarySearch {
    private int x;
    private int n;

    public void bSearch()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        n = Integer.parseInt(myObj.nextLine());


        System.out.println("Enter value of x to be searched in array: ");
        x = Integer.parseInt(myObj.nextLine());

        System.out.println("Enter values in arrays: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(myObj.nextLine());

        int l=0;
        int r=n-1;
        int mid=0;

        while(l<=r)
        {
            mid=(l+r)/2;
            if(arr[mid]<x) l=mid+1;
            else if(arr[mid]>x) r=mid-1;
            else
            {
                System.out.println(mid+1);
                return;
            }
        }

        System.out.println("No element "+ x + "in array");
        return;
    }
}
