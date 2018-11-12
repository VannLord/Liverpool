package Loc.StackAndQueue.Queue;

import Loc.StackAndQueue.Queue.MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(1);
        System.out.println(" Is queue empty ? "+myQueue.isEmpty());
        myQueue.enqueue(11);
        myQueue.dequeue();
        myQueue.enqueue(74);
        myQueue.enqueue(30);
        myQueue.enqueue(7);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue(84);
        myQueue.dequeue();
        myQueue.enqueue(15);
        myQueue.enqueue(16);
        myQueue.dequeue();
    }
}
