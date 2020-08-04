package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConMain {

    public static void main(String args []){
        BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(15);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("Producing/Consuming has started");
    }
}
