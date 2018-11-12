package Loc.StackAndQueue.LinkedListQueue;

import Loc.StackAndQueue.LinkedListQueue.MyLinkedListQueue;

public class LinkedListQueueTest {
    public static void main(String[] args) {
    MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        System.out.println("Dequeued item is " + queue.dequeue().key);
        queue.dequeue();
        System.out.println("Dequeued item is " + queue.dequeue().key);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
}
}
