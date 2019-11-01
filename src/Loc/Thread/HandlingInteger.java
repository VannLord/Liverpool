package Loc.Thread;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class HandlingInteger {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n value: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Thread thread1 = new Thread(() -> {
            int[] ints = new int[n];
            for (int i = 0; i < n ; i++) {
                ints[i] = i;
            }
            Thread thread2 = new Thread(() -> {
                int sum = 0;
                for (int i = 0; i < n ; i++) {
                    sum += ints[i];
                }
                System.out.println(sum);
            });
            thread2.start();
        });
        thread1.start();
    }
}
