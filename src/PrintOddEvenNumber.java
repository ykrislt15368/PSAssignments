//
//class Printer implements Runnable{
//    static int counter = 1;
//    int reminder;
//
//    static Object lock = new Object();
//
//    Printer(int reminder){
//        this.reminder= reminder;
//    }
//
//    public void printer(){
//        System.out.println(Thread.currentThread().getName()+" "+counter++);
//    }
//
//    @Override
//    public void run(){
//        for(int i=1;i<=10;i++){
//            synchronized (lock) {
//                while (counter % 2 != reminder)
//                    try {
//                        lock.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                printer();
//                lock.notifyAll();
//            }
//        }
//    }
//
//
//}
//
//public class PrintOddEvenNumber{
//
//    public static void main(String[] args){
//
//        PrinterPrime.Printer evenObject = new PrinterPrime.Printer(0);
//        PrinterPrime.Printer oddObject = new PrinterPrime.Printer(1);
//
//        Thread even = new Thread(evenObject,"Even Thread");
//        Thread odd = new Thread(oddObject,"Odd Thread");
//
//        even.start();
//        odd.start();
//    }
//}