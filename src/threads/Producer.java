package threads;



import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run(){
        try {
            for (int i = 0;i< 100; i++){
                Message message = new Message(""+i);
                queue.put(message);
                //Thread.sleep(i);
                System.out.println("Producing : "+message.getMsg());
            }
            queue.put(new Message("exit"));
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
