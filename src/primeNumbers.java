import java.util.Scanner;

public class primeNumbers {
    private int n;

    static boolean isPrime(int k)
    {
        if(k==1 || k==0) return false;

        for(int i=2;i*i<=k;i++)
            if(k%i==0) return false;

        return true;
    }

    public void primeWrite()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value of n for prime numbers : ");
        n = Integer.parseInt(myObj.nextLine());
        //System.out.println(n);
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))
                System.out.print(i+" ");
        }
        System.out.println("");
        return;
    }

    public static void main(String[] args) {

        primeNumbers PrimeNumbers = new primeNumbers();
        PrimeNumbers.primeWrite();

        return;
    }
}
