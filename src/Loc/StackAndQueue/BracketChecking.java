package Loc.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class BracketChecking {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        string = scanner.nextLine();
        char[] chars = string.toCharArray();
        Stack<Character> right = new Stack<>();
        Stack<Character> left = new Stack<>();
        for (int i = 0; i < chars.length ; i++) {
            if(chars[i] =='(') left.push(chars[i]);
            if(chars[i] ==')') right.push(chars[i]);
        }
        if(left.size() == right.size()) System.out.println(" Right ");
        else System.out.println(" Wrong ");
    }
}
