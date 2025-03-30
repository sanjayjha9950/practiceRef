package GCC.oddeventhread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    private static final Object lock = new Object();
    private static boolean isOdd = true;

    public static void main(String[] args) {

        /*Thread oddThread = new Thread(new Printer(true), "T1");
        Thread evenThread = new Thread(new Printer(false), "T2");

        oddThread.start();
        evenThread.start();*/

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        AtomicBoolean isOdd= new AtomicBoolean(true);
        Runnable r1 = ()-> {
            try {
                synchronized (numList) {
                    for (int i = 0; i < numList.size(); i++) {
                        if (numList.get(i) == 1 || numList.get(i) % 2 == 1) {
                            numList.wait();
                        }

                    }
                }
                //System.out.println(Thread.currentThread().getName() + "- " + numList.get(i));
                isOdd.set(!isOdd.get());
                numList.notifyAll();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };


        Thread oddThread = new Thread(r1, "T1");
        Thread evenThread = new Thread(r1, "T2");
        oddThread.start();
        evenThread.start();
        /*List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);


        Runnable r2 = ()-> {

                for (int i = 0; i < numList.size(); i++) {
                    try {
                        if (numList.get(i) % 2 == 0) {
                            synchronized (numList){
                                numList.wait();
                            }

                            System.out.println(Thread.currentThread().getName() + "- " + numList.get(i));
                            //numList.wait();
                            numList.notify();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

            }

        };

        Thread t1= new Thread(r1,"T1");
        Thread t2 = new Thread(r2,"T2");
        t1.start();
        t2.start();*/
    }

    static class Printer implements Runnable {
        private final boolean printOdd;

        Printer(boolean printOdd) {
            this.printOdd = printOdd;
        }

        @Override
        public void run() {
            for (int i = printOdd ? 1 : 2; i <= 10; i += 2) {
                synchronized (lock) {
                    while (isOdd != printOdd) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "-" + i);
                    isOdd = !isOdd;
                    lock.notifyAll();
                }
            }
        }
    }
}
