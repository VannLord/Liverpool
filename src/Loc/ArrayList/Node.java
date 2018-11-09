package Loc.ArrayList;

public class Node<E> {
    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Node() {
    }

    public Object getData() {
        return data;
    }
}
