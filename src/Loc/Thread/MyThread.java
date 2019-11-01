package Loc.Thread;

import Loc.StackAndQueue.MyStack;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i+" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
       Thread thread1 = new Thread(myThread1);
       Thread thread2 = new Thread(myThread2);
       thread1.start();
       thread2.start();
    }
}
