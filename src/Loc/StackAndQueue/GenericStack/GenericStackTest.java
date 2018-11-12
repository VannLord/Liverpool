package Loc.StackAndQueue.GenericStack;

import Loc.StackAndQueue.GenericStack.MyGenericStack;

public class GenericStackTest {
    public static void main(String[] args) {
        MyGenericStack stack = null;
        System.out.println("1. Stack of integers");
        stack.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stack.stackOfIStrings();
    }
}

