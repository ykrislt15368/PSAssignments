package MultiThreads;

public class SequenceGeneratorTask implements Runnable {
    private NumbersGenerator numberGenerator;
    private int result;

    public SequenceGeneratorTask(NumbersGenerator numberGenerator, int result) {
        this.numberGenerator = numberGenerator;
        this.result = result;
    }

    @Override
    public void run(){
        numberGenerator.printNumbers(result);
    }
}
