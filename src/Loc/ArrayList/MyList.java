package Loc.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    E[] elements;

    public MyList() {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements =  (E[]) new Object[capacity];
    }

    public void add(int index, E element) {
        if(index < 0) return;
        if (index > elements.length) {
            E[] elements1 = (E[]) new Object[index];
            for (int i = 0; i < elements.length; i++) {
                elements1[i] = elements[i];
            }
            elements = elements1;
        }
        elements[index-1] = element;
        size++;
    }

    public E[] remove(int index) {
        if (index > elements.length || index < 0) {
            System.out.println("Error!The elements you want to remove doesn't exist");
        } else {
            if(elements[index] != null) size--;
            for (int i = index; i < elements.length - 1; i++) {
                elements[index] = elements[index+1];
            }

        }
        return elements;
    }

    public int size(){
        System.out.println("Size of the list: "+size);
        return size;
    }

    public void show() {
        for (int i = 0; i < elements.length; i++)
            if (i == 0) {
                System.out.printf("(%s, ", elements[i]);
            } else {
                if (i == elements.length - 1) {
                    System.out.printf("%s)", elements[i]);
                } else {
                    System.out.printf("%s ,", elements[i]);
                }
            }
        System.out.println("\n");
    }

    public E[] clone()
    {
        E[] elements1 = (E[]) new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            elements1[i] = elements[i];
        }
        return elements1;
    }

    public boolean contains(E o){
        for (E E : elements
             ) {
            if(E == o) return true;
        }
        return false;
    }

    public int indexOf(E o){
        for (int i = 0; i < elements.length ; i++) {
            if(elements[i] == o) return i;
        }
        return -1;
    }

    public boolean add(E e){
        for (int i = 0; i < elements.length ; i++) {

                if(elements[i] == null){
                    elements[i] = e;
                return true;
            }
        }
        return false;
    }

    public E get(int i){
        if(i < 0 || i > elements.length) return null;
        else return elements[i];
    }

    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY] ;
    }

    public void ensureCapacity(){
        E[] elements1 = (E[]) new Object[elements.length*2];
        for (int i = 0; i < elements.length; i++) {
            elements1[i] = elements[i];
        }
        elements = elements1;
    }
    }