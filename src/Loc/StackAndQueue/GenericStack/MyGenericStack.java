package Loc.StackAndQueue.GenericStack;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        this.stack = new LinkedList<>();
    }
    int size(){
        return stack.size();
    }
    boolean isEmpty(){
        if(stack.size() == 0) return true;
        return false;
    }
    T pop(){
        if (stack.isEmpty()) return null;
        return  stack.removeLast();
    }
    void push(T e){
        stack.addLast(e);
    }
    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after pushing elements: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (stack.size() != 0) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after clearance : " + stack.size());
    }
    public static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after pushing integers: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (stack.size() != 0) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after clearance : " + stack.size());
    }


}
