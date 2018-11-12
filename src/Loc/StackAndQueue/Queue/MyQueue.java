package Loc.StackAndQueue.Queue;

public class MyQueue {

    int capacity;
    int[] queueArr;
    int head = 0;
    int tail = -1;
    int currentSize = 0;

    public MyQueue(int size) {
        capacity = size;
        queueArr = new int[capacity];
    }

    boolean isFull() {
        if (currentSize == capacity) return true;
        return false;
    }

    boolean isEmpty() {
        if (currentSize == 0) return true;
        return false;
    }

    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = num;
            currentSize++;
            System.out.println("Element " + num + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isEmpty()) System.out.println("Nothing to dequeue");
        else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Element " + queueArr[head - 1] +" is removed");
                head = 0;
            } else {
                System.out.println("Element " + queueArr[head - 1] +" is removed");
            }
            currentSize--;
        }
    }
}
