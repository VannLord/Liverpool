package Loc;

import java.util.Scanner;

public class A extends B {
    public static int enterNumberA(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number(A): ");
        number = scanner.nextInt();
        return number;
    }
}

