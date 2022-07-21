package PrinterPrime;

class Printer implements Runnable{
    static int counter = 1;
    int reminder;

    static Object lock = new Object();

    Printer(int reminder){
        this.reminder= reminder;
    }

    public void printer(){
        System.out.println(Thread.currentThread().getName()+" "+counter++);
    }

    public int func(int v){

        for(int j=2;j*j<=v;j++)
            if(v%j==0) return 0;
        return 1;
    }

    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            synchronized (lock) {
                while (func(counter) != reminder)
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                printer();
                lock.notifyAll();
            }
        }
    }


}

public class PrintPrime{

    public static void main(String[] args){

        Printer evenObject = new Printer(0);
        Printer oddObject = new Printer(1);

        Thread even = new Thread(evenObject,"Even Thread");
        Thread odd = new Thread(oddObject,"Odd Thread");

        even.start();
        odd.start();
    }
}