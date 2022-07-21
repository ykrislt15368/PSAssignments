package MultiThreads;

public class SequenceNumberGeneratorTest {

    private static final int TOTAL_NUMBER_IN_SEQUENCE = 10;
    private static final int TOTAL_NUMBER_OF_THREADS = 3;

    public static void main(String[] args){

        NumbersGenerator numbersgenerator = new NumbersGenerator(TOTAL_NUMBER_OF_THREADS,TOTAL_NUMBER_IN_SEQUENCE);

        Thread t1 = new Thread(new SequenceGeneratorTask(numbersgenerator,1),"Thread-1");
        Thread t2 = new Thread(new SequenceGeneratorTask(numbersgenerator,2),"Thread-2");
        Thread t3 = new Thread(new SequenceGeneratorTask(numbersgenerator,0),"Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
