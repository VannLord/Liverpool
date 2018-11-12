package Loc.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class CovertingDecimalToBinary {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number needing coverted: ");
        number = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (number != 0){
            stack.push(number % 2);
            number = number/2;
        }
        System.out.print("After coverting into binary: ");
        while(stack.empty() == false){
            System.out.print(stack.pop());
        }
    }
}
