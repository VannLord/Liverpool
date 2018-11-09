package Loc.StackAndQueue;

import java.util.Stack;

public class ReversedStack {
    public static void main(String[] args) {
        Stack<String> stack  = new Stack<>();
        String string = " Côn đồ trên con đò";
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length ; i++) {
            stack.push(strings[i]);
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(" "+stack.pop());
        }

    }
}
