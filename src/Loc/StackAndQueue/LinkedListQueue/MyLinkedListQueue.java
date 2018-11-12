package Loc.StackAndQueue.LinkedListQueue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int num){
        Node temp = new Node(num);
        if (tail == null) {
            head = tail = temp;
        }
        tail.next = temp;
        tail = temp;
    }
    public Node dequeue() {
        if (head == null)
            return null;
        Node temp = head;
        head = head.next;
        if (head == null)
            tail = null;
        return temp;
    }

}
