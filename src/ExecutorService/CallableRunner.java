package ExecutorService;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {

    private String name;
    private Thread thread;

    public CallableTask(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception{
        thread.sleep(1000);
        return "Hello "+ name;
    }
}
public class CallableRunner{

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       ExecutorService executorService = Executors.newFixedThreadPool(1);
       Future<String> welcomeFuture =
               executorService.submit(new CallableTask("in28 minutes"));
       System.out.println("\n new CallableTask(\"in28 minutes\") Main completed");

        String welcomeMessage = welcomeFuture.get();
        
        System.out.println(welcomeMessage); 
        System.out.println("Main Completed");
    }
}

//How to create callable task and how to submit using submitter