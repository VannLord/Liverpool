package Loc.ArrayList;

public class MyLinkedList<E> extends Node {
    int numNodes;
    Node<E> head, tail;

    public MyLinkedList() {
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
        if (tail == null) tail = head;

    }

    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null) tail = head = newNode;
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        numNodes++;

    }

    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        if (index == numNodes) addLast(e);
        if (index > numNodes) System.out.println("Error!The index is outside the list");
        if (0 < index && index < numNodes) {
            Node<E> current;
            current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> temp;
            temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = current.next;
            numNodes++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) return null;
        else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = temp.next;
            numNodes--;
            return (E) temp.getData();
        }
    }

    public boolean remove(Object o) {
        if (numNodes == 0) System.out.println("Nothing to remove!");
        Node<E> current = head;
        for (int i = 0; i < numNodes; i++) {
            if (current == o) {
                remove(i);
                current = current.next;
                return true;
            }
        }
        return false;

    }

    public int size() {
        return numNodes;
    }

    public E clone() {
        if (numNodes == 0) {
            System.out.println("Error! Nothing to duplicate");
            return null;
        } else {
            MyLinkedList clone = new MyLinkedList();
            Node current = head;
            Node current1 = clone.head;
            for (int i = 0; i < numNodes - 1; i++) {
                current1 = current;
                current = current.next;
                current1 = current1.next;
                clone.numNodes++;
            }
            return (E) clone.data;
        }
    }

    public boolean contain(E e) {
        if (numNodes == 0) {
            System.out.println("Nothing is being contained!!!");
        } else {
            Node<E> current = head;
            for (int i = 0; i < numNodes - 1; i++) {
                if (current == e) return true;
                current = current.next;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        if (numNodes == 0) {
            System.out.println("Nothing to be located !!!");
        } else {
            Node<E> current = head;
            for (int i = 0; i < numNodes - 1; i++) {
                if (current == e) return i;
                current = current.next;
            }
        }
        return -1;
    }

    public E get(int index) {
        if (numNodes == 0 || index < 0 || index > numNodes) {
            System.out.println("Nothing to be got !!!");
        } else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return (E) current.data;
        }
        return null;
    }

    public E getFirst() {
        if (numNodes == 0) return null;
        return (E) head;
    }

    public E getLast() {
        if (numNodes == 0) return null;
        return (E) tail;
    }

    public E clear() {
        return (E) new MyLinkedList<E>();
    }

    public void show() {
        if (numNodes == 0) System.out.println("[]");
        else {
            Node<E> current = head;
            for (int i = 0; i < numNodes-1; i++) {
                System.out.print(current.data + " ");

                current = current.next;

            }
        }

    }
}
