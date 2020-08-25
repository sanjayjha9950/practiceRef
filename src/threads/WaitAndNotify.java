package threads;

public class WaitAndNotify {

    static Integer num = 0;
    public static  void main(String args[]) throws InterruptedException{

        try {

            Runnable r1 = () -> {
                synchronized (num) {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Adding " + i + " to " + num);
                        num += i;
                    }
                    num.notify();
                }
            };
            Runnable r2 = () -> {
                synchronized (num) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Num is: " + num);
                }
            };
            Thread a = new Thread(r1);
            Thread b = new Thread(r2);
            a.start();
            b.start();
        }catch (Exception e){
            e.printStackTrace();
        }

        /*ThreadC c = new ThreadC();
        c.start();
        synchronized (c){
            c.wait();
            System.out.println("Total is :"+c.total);
        }*/

    }
}

class ThreadC extends Thread{

    int total=0;
    public void run(){
        synchronized (this) {
            for (int i = 0; i < 100; i++)
                total += i;
            notify();
        }
    }
}