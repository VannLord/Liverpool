package Loc.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        boolean check = false;
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        string = scanner.nextLine();
        char[] chars = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
            queue.add(chars[i]);
        }
        while (!stack.empty()) {
            if (stack.pop() == ((ArrayDeque<Character>) queue).pop()) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        System.out.println("Is string a Palindrome ? "+check);
    }
}
