package threads;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run(){
        try {
            Message message ;//= queue.take();
            while (!(message =queue.take()).getMsg().equals("exit")){
                Thread.sleep(10);
                System.out.println("Consuming : "+message.getMsg());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
