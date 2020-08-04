package threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable implements Callable {

    @Override
    public String call(){
        try {
            //Thread.sleep(1000);
            return Thread.currentThread().getName();

        }catch (Exception e){
            e.printStackTrace();
        }
        return Thread.currentThread().getName();
    }

    public static void main(String args[]){
        try{
            ExecutorService executor  = Executors.newFixedThreadPool(10);
            List <Future<String>> list = new ArrayList<>();
            Callable<String> callable = new MyCallable();

            for (int i = 0; i < 100; i++) {
                Future<String> future = executor.submit(callable);
                list.add(future);
            }

            list.forEach(stringFuture -> {
                try {
                    System.out.println(new Date()+ " : "+stringFuture.get());
                } catch (InterruptedException |ExecutionException ie) {
                    ie.printStackTrace();
                }
            });

            /*for (Future<String> fut : list){
                System.out.println(new Date()+" : "+fut.get());
            }*/
            executor.shutdown();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
